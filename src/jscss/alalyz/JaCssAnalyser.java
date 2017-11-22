package jscss.alalyz;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import file.operate.FIleInterface;
import file.operate.impl.FileHandler;

public class JaCssAnalyser {

	private Set<String> attributeList = null;
	
	private FIleInterface fIleInterface = null;
	
	private String file = null;
	
	public JaCssAnalyser(String file, Set<String> attributeList) {
		fIleInterface = new FileHandler();
		this.attributeList = attributeList;
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
				}
			}
		}
		
		return false;
	}
}
