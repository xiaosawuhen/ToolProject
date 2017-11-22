package file.operate;

import java.io.File;
import java.util.List;

public interface FIleInterface {

	boolean movefile(File from, File to);
	
	long moveDir(File from, File to);
	
	boolean writeFile(File file, List<String> dataList);
	
	List<String> readFile(File file);
}
