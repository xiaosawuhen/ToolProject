package file.delete;

import java.io.File;

public class FileDeleteHandler {

	public static void main(String[] args) {
		FileDeleteHandler deleteHandler = new FileDeleteHandler();
		
		File file = new File("C:\\wnn\\work\\PO\\PO-1502\\nemob2bstorefront2017-11-09--15-59-05");
		
		deleteHandler.deleteDir(file);
	}
	
	public boolean deleteDir(File file){
		if(file.isDirectory()){
			File[] subfiles = file.listFiles();
			for (File subfile : subfiles) {
				deleteDir(subfile);
			}

			subfiles = file.listFiles();
			for (File subfile : subfiles) {
				subfile.delete();
			}
			
			file.delete();
		} else if(file.isFile()) {
			deleteFile(file);
		}
		
		return false;
	}
	
	public boolean deleteFile(File file) {
		return file.delete();
	}
}
