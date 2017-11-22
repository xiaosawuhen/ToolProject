package jsp.analyz;

public class JspAttribute {

	private String name;
	
	private String value;
	
	private String valueDealed;
	
	public JspAttribute(String name, String value) {
		this.name = name;
		this.value = value;
		if(value.equals("facet_block ${facetData.multiSelect ? '' : 'indent'}")){
			System.out.println();
		}
		
		
		String valueTemp = value;
		int index = valueTemp.indexOf("${");
		while(index > 0){
			String value0 = valueTemp.substring(0, index);
			String value1 = valueTemp.substring(index + 2);
			
			if(value1.indexOf("}")+1 != value1.length()){
				value1 = value1.substring(value1.indexOf("}") + 1);
			} else {
				value1 = "";
			}
			
			valueTemp = value0 + value1;
			index = valueTemp.indexOf("${");
		}
		
		this.valueDealed = valueTemp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValueDealed() {
		return valueDealed;
	}

	public void setValueDealed(String valueDealed) {
		this.valueDealed = valueDealed;
	}
}
