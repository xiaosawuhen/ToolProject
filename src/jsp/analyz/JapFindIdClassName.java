package jsp.analyz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JapFindIdClassName {
	
	/**
	 * fileContent
	 */
	private List<String> fileContent = null;
	
	private Set<JspAttribute> idList = null;
	
	private Set<JspAttribute> classList = null;
	
	private Set<JspAttribute> nameList = null;
	
	public JapFindIdClassName(List<String> fileContent) {
		this.fileContent = fileContent;
		this.idList = new HashSet<>();
		this.classList = new HashSet<>();
		this.nameList = new HashSet<>();
	}
	
	public void start() {
		Iterator<String> fileIterator = fileContent.iterator();
		while(fileIterator.hasNext()){

			String line = fileIterator.next().trim();
			
			if(line.contains("id")){
				String value = JspUtil.getProperty1(line, "id");
				if(value != null){
					idList.add(new JspAttribute("id", value));
				}
			} else if(line.contains("class")){
				String value = JspUtil.getProperty1(line, "class");
				if(value != null){
					classList.add(new JspAttribute("class", value));
				}
			}  else if(line.contains("name")){
				String value = JspUtil.getProperty1(line, "name");
				if(value != null){
					nameList.add(new JspAttribute("name", value));
				}
			}
		}

		for (JspAttribute attribute : idList) {
			System.out.println(attribute.getValue());
			System.err.println(attribute.getValueDealed());
		}
	}
}
 