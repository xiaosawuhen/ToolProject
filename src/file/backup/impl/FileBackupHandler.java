package file.backup.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import date.DateHandler;
import file.backup.FileBackupInterface;
import file.operate.FIleInterface;
import file.operate.impl.FileHandler;

public class FileBackupHandler implements FileBackupInterface {
	
	private FIleInterface fileInterface = new FileHandler();
	
	private List<String> backupList = new ArrayList<String>();

	@Override
	public boolean backupFile(File from, File to) {
		
		boolean result = fileInterface.movefile(from, to);
		
		if(result) {
			backupList.add(from.getAbsolutePath());
		}
		
		return result;
	}

	@Override
	public long backupDir(File from, File to) {
		
		if(from.exists()){
			int cnt = 0;
			if(from.isFile()){
				if(backupFile(from, to)){
					cnt = 1;
				} else {
					System.err.println("Move Failed : " + from.getAbsolutePath());
					cnt = 0;
				}
					
			} else if(from.isDirectory()) {
				File[] subFiles = from.listFiles();
				
				// get lastFolder
				String fromPath = from.getAbsolutePath();
				String lastfolder = fromPath.substring(fromPath.lastIndexOf(File.separator) + 1);
				
				// change new to Folder
				String toPath = to.getAbsolutePath() + File.separator + lastfolder;
				to = new File(toPath);
				
				for (File subFile : subFiles) {
					cnt += backupDir(subFile, to);
				}
			}
			
			return cnt;
		} else {
			System.err.println("File not Exist : " + from.getAbsolutePath());
		}
		
		return -1;
	}
	
	public long backupPartDir(File from, File to, List<String> fileList){

		if(from.exists()){
			if(from.isDirectory()){

				// get lastFolder
				String fromPath = from.getAbsolutePath();
				String lastfolder = fromPath.substring(fromPath.lastIndexOf(File.separator) + 1);

				String newDate = DateHandler.getFormartDate(new Date(), "yyyy-MM-dd--HH-mm-ss");
				// change new to Folder
				String toPath = to.getAbsolutePath() + File.separator + lastfolder + newDate;
				to = new File(toPath);
				
				backupDir(from, to, fileList);
				createFileListLog(to);
			} else {
				System.err.println("From This not a Directory : " + from.getAbsolutePath());
			}
		}
		
		return 0;
	}
	
	@Override
	public long backupDir(File from, File to, List<String> fileList) {

		int cnt = 0;
		
		File[] subFiles = from.listFiles();
		
		for (File subFile : subFiles) {
			if(subFile.isFile()){
				if(fileList.contains(subFile.getAbsolutePath())){
					if(backupFile(subFile, to)){
						cnt = 1;
					} else {
						System.err.println("Move Failed : " + subFile.getAbsolutePath());
						cnt = 0;
					}
				} else {
					cnt = 0;
				}
			} else if(subFile.isDirectory()) {
				// get lastFolder
				String subFilePath = subFile.getAbsolutePath();
				String lastfolder = subFilePath.substring(subFilePath.lastIndexOf(File.separator) + 1);
				
				// change new to Folder
				String toPath = to.getAbsolutePath() + File.separator + lastfolder;
				File subTo = new File(toPath);
				cnt += backupDir(subFile, subTo, fileList);
			}
		}
		
		return cnt;
	}

	@Override
	public List<String> getBackupList() {
		List<String> result = new ArrayList<String>();
		result.addAll(backupList);
		backupList.clear();
		return result;
	}

	@Override
	public void createFileListLog(File to){
		
		String newDate = DateHandler.getFormartDate(new Date(), "yyyy-MM-dd--HH-mm-ss");
		String listFileName = "source";
		String logFilePath = to.getAbsolutePath() + File.separator + listFileName + newDate;
		File logFile = new File(logFilePath);
		
		fileInterface.writeFile(logFile, getBackupList());
	}

}
