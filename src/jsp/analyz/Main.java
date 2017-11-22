package jsp.analyz;

import java.io.File;
import java.util.List;

import file.operate.FIleInterface;
import file.operate.impl.FileHandler;
import jsp.integrate.JspIntegrate;

public class Main {

	public static void main(String[] args) {
		String filePath = "C:\\sceneric-hybris\\extensions\\nemo\\nemob2bstorefront\\web\\webroot\\WEB-INF\\views\\desktop\\pages\\category\\accessoryGridPage.jsp";
		String baseUlr = "C:\\sceneric-hybris\\extensions\\nemo\\nemob2bstorefront\\web\\webroot";
		JspIntegrate jspIntegrate = new JspIntegrate(filePath, baseUlr);
		
		List<String> fileContent = jspIntegrate.start();
		
		FIleInterface fIleInterface = new FileHandler();
		fIleInterface.writeFile(new File(filePath + ".backup"), fileContent);
	}
}
