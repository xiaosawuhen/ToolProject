package jsp.analyz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import jsp.integrate.JspIntegrate;
import jsp.integrate.bean.PageInfo;
import jsp.integrate.bean.PageTaglibInfo;

public class JspAnalyser {
	
	/**
	 * fileContent
	 */
	private List<String> fileContent = null;
	
	/**
	 * baseUrl
	 */
	private String baseUrl = null;
	
	/**
	 * jspIntegrateMap
	 */
	private Map<String, JspIntegrate> jspIntegrateMap = null;
	
	/**
	 * pageInfo
	 */
	private PageInfo pageInfo = null;
	
	public JspAnalyser(List<String> fileContent, String baseUrl) {
		this.fileContent = fileContent;
		this.baseUrl = baseUrl;
		this.jspIntegrateMap = new HashMap<>();
		this.pageInfo = new PageInfo(baseUrl);
	}
	
	private String defineStart = "<%@";
	private String defineEnd = "%>";
	private String elementStart = "<";
	private String elementEnd = "/>";
	private String elementHalfStart = "</";
	private String elementHalfEnd = ">";
	private String taglibSign = "taglib";
	private String taglibPrefix = "prefix";
	private String taglibTagdir = "tagdir";
	
	public List<String> start(){
		List<String> integratedList = new ArrayList<>();
		
		Iterator<String> fileIterator = fileContent.iterator();
		
		while(fileIterator.hasNext()){
			String line = fileIterator.next().trim();
			
			if(line.startsWith(defineStart)){
				String defineLine = line;
				
				while(!defineLine.endsWith(defineEnd)) {
					defineLine += " " + fileIterator.next().trim(); // add space between two lines
				}

				integratedList.add(defineLine);// write defineLine;
				
				String defineContent = defineLine.replaceAll(defineStart, "").replaceAll(defineEnd, "").trim();
				
				if(defineContent.startsWith(taglibSign)){
					
					int tagdirIndex = defineContent.indexOf(taglibTagdir);
					if(tagdirIndex > 0){
						PageTaglibInfo pageTaglibInfo = new PageTaglibInfo();
						String tagdir = getProperty(defineContent, taglibTagdir);
						String prefix = getProperty(defineContent, taglibPrefix);
						pageTaglibInfo.setPrefix(prefix);
						pageTaglibInfo.setTagdir(tagdir);
						pageInfo.addTaglib(pageTaglibInfo);
					}
				}
				
			} else if(line.startsWith(elementHalfStart)){
				String elementLine = line;
				while(!elementLine.endsWith(elementHalfEnd)) {
					// TODO may be the error line
					elementLine += " " + fileIterator.next().trim(); // add space between two lines
				}

				integratedList.add(elementLine);// write defineLine;
				
			} else if(line.startsWith(elementStart)){
				String elementLine = line;
				while(!(elementLine.endsWith(elementEnd)||elementLine.endsWith(elementHalfEnd))) {
					// TODO may be the error line
					elementLine += " " + fileIterator.next().trim(); // add space between two lines
				}
				
				if(elementLine.endsWith(elementEnd)) {
					String elementContent = elementLine.replaceAll(elementStart, "").replaceAll(elementEnd, "").trim();
					
					String sign = elementContent;
					if(elementContent.indexOf(" ") > 0){
						sign = elementContent.substring(0, elementContent.indexOf(" "));
					}
					if(sign.contains(":")) {
						String[] taglibImport = sign.split(":");
						String taglibUrl = pageInfo.getTaglibUrl(taglibImport);

						if(taglibUrl != null){
							JspIntegrate jspIntegrate = new JspIntegrate(taglibUrl, baseUrl);
							jspIntegrateMap.put(taglibImport[0], jspIntegrate);
							
							List<String> fileContent = jspIntegrate.start();
							integratedList.addAll(fileContent);
						} else {
							integratedList.add(elementLine);
						}
						
					} else {
						integratedList.add(elementLine);// write defineLine;
					}
				} else {
					integratedList.add(elementLine);// write defineLine;
				}
				
			} else {
				integratedList.add(line);// write Line;
			}
		}
		
		return integratedList;
	}
	
	private String getProperty(String line, String name) {

		String property = null;
		
		String propertyStart = line.split(name)[1].trim().substring(1);
		
		if(propertyStart.startsWith("\"")){
			propertyStart = propertyStart.substring(1);
			property = propertyStart.substring(0, propertyStart.indexOf("\""));
		} else if(propertyStart.startsWith("\'")){
			propertyStart = propertyStart.substring(1);
			property = propertyStart.substring(0, propertyStart.indexOf("\'"));
		}
		
		return property;
	}
}
