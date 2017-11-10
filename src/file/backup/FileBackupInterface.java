package file.backup;

import java.io.File;
import java.util.List;

public interface FileBackupInterface {

	boolean backupFile(File from, File to);
	
	long backupDir(File from, File to);
	
	long backupDir(File from, File to, List<String> fileList);
	
	List<String> getBackupList();
	
	void createFileListLog(File to);
}
