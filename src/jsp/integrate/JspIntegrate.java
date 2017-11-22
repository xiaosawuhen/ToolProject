package jsp.integrate;

import java.io.File;
import java.util.List;

import file.operate.FIleInterface;
import file.operate.impl.FileHandler;
import jsp.analyz.JspAnalyser;

public class JspIntegrate {

	/**
	 * fIleInterface
	 */
	private FIleInterface fIleInterface = null;
	
	/**
	 * jspAnalyser
	 */
	private JspAnalyser jspAnalyser = null;
	
	public JspIntegrate (String filePath, String baseUrl) {
		fIleInterface = new FileHandler();
		List<String> fileContent = fIleInterface.readFile(new File(filePath));
		
		jspAnalyser = new JspAnalyser(fileContent, baseUrl);
	}

	public List<String> start() {
		return jspAnalyser.start();
	}
}
