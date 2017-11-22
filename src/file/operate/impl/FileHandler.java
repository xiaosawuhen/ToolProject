package file.operate.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import file.operate.FIleInterface;

public class FileHandler implements FIleInterface {

	public static void main(String[] args) {
		File from = new File("C:\\Users\\nannan.c.wang\\Desktop\\test report\\");
		File to = new File("C:\\wnn\\work\\PO");
		
		FileHandler fileCopyHandler = new FileHandler();
		long cnt = fileCopyHandler.moveDir(from, to);
		System.out.println(cnt);
	}
	
	@Override
	public boolean movefile(File from, File to) {

		// get lastFolder
		String fromPath = from.getAbsolutePath();
		String lastfolder = fromPath.substring(fromPath.lastIndexOf(File.separator) + 1, fromPath.length());
		
		// change new to Folder
		if(!to.exists()){
			to.mkdirs();
		}
		String toPath = to.getAbsolutePath() + File.separator + lastfolder;
		to = new File(toPath);
		
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(from));
			bufferedWriter = new BufferedWriter(new FileWriter(to));
			
			String readedLine = bufferedReader.readLine();
			
			while (readedLine != null) {
				
				bufferedWriter.write(readedLine);
				bufferedWriter.newLine();
				
				readedLine = bufferedReader.readLine();
			}
			
			bufferedWriter.flush();
			bufferedWriter.close();
			
			bufferedReader.close();
			
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}
		
		return true;
	}

	@Override
	public long moveDir(File from, File to) {
		
		if(from.exists()){
			if(from.isFile()){
				if(movefile(from, to)){
					return 1;
				} else {
					System.err.println("Move Failed : " + from.getAbsolutePath());
					return 0;
				}
					
			} else if(from.isDirectory()) {
				File[] subFiles = from.listFiles();
				
				// get lastFolder
				String fromPath = from.getAbsolutePath();
				String lastfolder = fromPath.substring(fromPath.lastIndexOf(File.separator) + 1);
				
				// change new to Folder
				String toPath = to.getAbsolutePath() + File.separator + lastfolder;
				to = new File(toPath);
				to.mkdirs();
				
				int cnt = 0;
				for (File subFile : subFiles) {
					cnt += moveDir(subFile, to);
				}
				
				return cnt;
			}
		} else {
			System.err.println("File not Exist : " + from.getAbsolutePath());
		}
		
		return -1;
	}

	@Override
	public boolean writeFile(File file, List<String> dataList) {

		BufferedWriter bufferedWriter = null;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(file));
			
			
			for (String string : dataList) {
				bufferedWriter.write(string);
				bufferedWriter.newLine();
			}
			
			bufferedWriter.flush();
			bufferedWriter.close();
			
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	@Override
	public List<String> readFile(File file) {

		BufferedReader bufferedReader = null;
		List<String> dataList = new ArrayList<String>();
		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			
			String readedLine = bufferedReader.readLine();
			
			while (readedLine != null) {
				
				dataList.add(readedLine);
				
				readedLine = bufferedReader.readLine();
			}
			
			bufferedReader.close();
			
		} catch (FileNotFoundException e) {
			return dataList;
		} catch (IOException e) {
			return dataList;
		}
		return dataList;
	}
}
