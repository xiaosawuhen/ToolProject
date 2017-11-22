package jsp.analyz;

import java.io.File;
import java.util.List;
import java.util.Set;

import file.operate.FIleInterface;
import file.operate.impl.FileHandler;
import jscss.alalyz.JaCssAnalyser;
import jsp.integrate.JspIntegrate;

public class Main {

	public static void main(String[] args) {
		String version = "1.1";
		String filePath = "C:\\sceneric-hybris\\extensions\\nemo\\nemob2bstorefront\\web\\webroot\\WEB-INF\\views\\desktop\\pages\\category\\accessoryGridPage.jsp";
//		String filePath = "C:\\sceneric-hybris\\extensions\\nemo\\nemob2bstorefront\\web\\webroot\\WEB-INF\\views\\addons\\lenovowcms\\desktop\\pages\\layout\\commonContent3ColumnsPage.jsp";
		String baseUlr = "C:\\sceneric-hybris\\extensions\\nemo\\nemob2bstorefront\\web\\webroot";
		JspIntegrate jspIntegrate = new JspIntegrate(filePath, baseUlr);
		
		List<String> fileContent = jspIntegrate.start();
		
		JapFindIdClassName japFindIdClassName = new JapFindIdClassName(fileContent);
		japFindIdClassName.start();
//		Set<String> idList = japFindIdClassName.getStringIdList();
//		Set<String> classList = japFindIdClassName.getStringClassList();
//		Set<String> nameList = japFindIdClassName.getStringNameList();

		FIleInterface fIleInterface = new FileHandler();
		String jscssConfig = "C:\\wnn\\workspace\\aaa_toolManage\\src\\jscss\\alalyz\\jscss.source";
		List<String> jscssContent = fIleInterface.readFile(new File(jscssConfig));
		System.out.println("=========================idList=========================");
		for (String jscssPath : jscssContent) {
			JaCssAnalyser jaCssAnalyser = new JaCssAnalyser(jscssPath, japFindIdClassName.getIdList());
			jaCssAnalyser.start();
		}
		System.out.println("=========================classList=========================");
		for (String jscssPath : jscssContent) {
			JaCssAnalyser jaCssAnalyser = new JaCssAnalyser(jscssPath, japFindIdClassName.getClassList());
			jaCssAnalyser.start();
		}
		System.out.println("=========================nameList=========================");
		for (String jscssPath : jscssContent) {
			JaCssAnalyser jaCssAnalyser = new JaCssAnalyser(jscssPath, japFindIdClassName.getNameList());
			jaCssAnalyser.start();
		}
		
		
		fIleInterface.writeFile(new File(filePath + version +".backup"), fileContent);
	}
}
