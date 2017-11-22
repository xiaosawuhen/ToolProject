package jsp.analyz;

public class JspUtil {

	
	public static String getProperty(String line, String name) {

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

	public static String getProperty1(String line, String name) {

		String property = null;
		String[] propertyArray = line.split(" " + name);
		
		if(propertyArray.length >= 2){
			if(!propertyArray[1].trim().startsWith("=")) {
//				System.err.println(line + "--->" + name);
			} else {
				String propertyStart = propertyArray[1].trim().substring(1);
				
				if(propertyStart.startsWith("\"")){
					propertyStart = propertyStart.substring(1);
					try {

						property = propertyStart.substring(0, propertyStart.indexOf("\""));
					} catch (Exception e) {
						System.out.println();
					}
				} else if(propertyStart.startsWith("\'")){
					propertyStart = propertyStart.substring(1);
					property = propertyStart.substring(0, propertyStart.indexOf("\'"));
				}
			}
		}
		
		return property;
	}
}
