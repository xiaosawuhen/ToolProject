package file;

import java.io.File;
import java.util.List;

import file.backup.FileBackupInterface;
import file.backup.impl.FileBackupHandler;
import file.copy.FIleInterface;
import file.copy.impl.FileHandler;

public class FileController {
	
	private FileBackupInterface fileBackupInterface = new FileBackupHandler();
	private FIleInterface fIleCopyInterface = new FileHandler();

	public static void main(String[] args) {
		FileController fileController = new FileController();
		
		fileController.backup();
	}
	

	public void backu1p() {
		File from = new File("C:\\Users\\nannan.c.wang\\Desktop\\PO-1502");
		File to = new File("C:\\wnn\\work\\PO\\PO-1502");
		
		FileBackupHandler fileBackupHandler = new FileBackupHandler();
		long cnt = fileBackupHandler.backupDir(from, to);
		fileBackupHandler.createFileListLog(to);
		System.out.println(cnt);
	}
	
	public void backup() {
		File config = new File("C:\\wnn\\workspace\\aaaaaaaaaaaatest\\src\\file\\backup.source");
		File from = new File("C:\\sceneric-hybris\\extensions\\nemo\\nemob2bstorefront");
		File to = new File("C:\\wnn\\work\\PO\\PO-1502");
		FileBackupHandler fileBackupHandler = new FileBackupHandler();
		
		FIleInterface fIleInterface = new FileHandler();
		List<String> filelist = fIleInterface.readFile(config);

		fileBackupHandler.backupPartDir(from, to, filelist);
	}
	
	public void backupPartDir(){
	}
	
}
