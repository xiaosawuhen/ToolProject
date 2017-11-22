package jscss.alalyz;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import file.operate.FIleInterface;
import file.operate.impl.FileHandler;
import jsp.analyz.JspAttribute;

public class JaCssAnalyser {

	private Set<String> attributeList = null;
	
	private Set<JspAttribute> jspAttributes = null;
	
	private FIleInterface fIleInterface = null;
	
	private String file = null;
	
	public JaCssAnalyser(String file, Set<JspAttribute> jspAttributes) {
		fIleInterface = new FileHandler();
		this.jspAttributes = jspAttributes;

		this.attributeList = new HashSet<>();
		for (JspAttribute attribute : this.jspAttributes) {
			attributeList.add(attribute.getValueDealed());
		}
		
		this.file = file;
		System.out.println(file);
	}
	
	public boolean start() {
		List<String> fileContent = fIleInterface.readFile(new File(file));
		Iterator<String> fileIterator = fileContent.iterator();

		Map<String, String> selectorMap = new HashMap<>();
		
		while(fileIterator.hasNext()){
			String line = fileIterator.next().trim();
			String newline = line;
			String tempLine = line;
			int index = tempLine.indexOf("$(");
			
			while(index > 0) {
				String value0 = tempLine.substring(0, index).trim();
				String value1 = null;
				try {

					value1 = tempLine.substring(index+2);
				} catch (Exception e) {
					System.out.println();
				}
				
				int valueselectoridx = value1.indexOf(")");
				if(valueselectoridx> 0) {
					String selector = value1.substring(0, valueselectoridx).replaceAll("\"", "").replaceAll("\'", "");
					selectorMap.put(selector, newline);
					
					value1 = value1.substring(valueselectoridx+1);
					tempLine = value0 + value1;
				} else {
					if(fileIterator.hasNext()){
						newline = fileIterator.next().trim();
						tempLine = value0 + "$(" + value1 + newline;
						line = line + newline;
					}
				}
				
				index = tempLine.indexOf("$(");
			}
		}
		
		for (String attribute : this.attributeList) {
			Set<String> selectorList = selectorMap.keySet();
			for (String selector : selectorList) {
				if(selector.contains(attribute)) {
					System.out.println(attribute + "-->" + selectorMap.get(selector));
					List<String> lineList = getLineList(attribute);
					System.out.println(attribute + "-->" + (lineList.size() > 0 ? lineList.get(0) : ""));
				}
			}
		}

		
		return false;
	}
	public List<String> getLineList(String name) {
		List<String> lineList = new ArrayList<>();
		for (JspAttribute attribute : this.jspAttributes) {
			if(attribute.getValueDealed().trim().equals(name.trim())){
				lineList.add(attribute.getLine());
			}
		}
		
		return lineList;
	}
}
