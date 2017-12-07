package db.handler;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import file.operate.FIleInterface;
import file.operate.impl.FileHandler;

public class ChangeCreateToDelete2 {

	private FIleInterface fIleInterface = null;
	
	private File file = null;

	List<String> sqlList = new ArrayList<>();
	
	public ChangeCreateToDelete2(String file) {
		fIleInterface = new FileHandler();
		this.file = new File(file);
	}
	
	Map<String, List<String>> tableMap = new HashMap<>();
	
	public void start(){
		
		List<String> fileContent = fIleInterface.readFile(this.file);
		Iterator<String> fileIterator = fileContent.iterator();
		
		boolean inCreate = false;
		String tableName = null;
		String insertLineBuffer = null;
		
		boolean insertvalue = false;
		
		while (fileIterator.hasNext()) {
			String line = fileIterator.next();
			
			//ALTER TABLE
			if(line.startsWith("CREATE")) {
				inCreate = true;
				insertvalue = false;
			} else if(line.startsWith("ALTER TABLE")) {
				insertvalue = false;
			}else if(line.startsWith("INSERT")) {
				insertvalue = true;
				inCreate = false;
				String tableinfo = line.split(" ")[2];
					if(tableinfo.indexOf("(") > 0) {
						tableName = tableinfo.substring(0, tableinfo.indexOf("("));
					} else {
						tableName = tableinfo.trim();
					}
				tableName = tableName.replaceAll("public.".toUpperCase(), "");
				insertLineBuffer = line.replaceAll("public.".toUpperCase(), "");
			}
			
			if(insertvalue) {
				if(insertLineBuffer != null){
					getTableList(tableName).add(insertLineBuffer);
					insertLineBuffer = null;
				} else {
					getTableList(tableName).add(line);
				}
			}
			
		}
//		writeTableInfo();
	}
	
	public void changeSql(String path, String output) {

		List<String> fileContent = fIleInterface.readFile(new File(path));
		Iterator<String> fileIterator = fileContent.iterator();

		boolean insertarea = false;
		
		while (fileIterator.hasNext()) {
			String line = fileIterator.next();
			
			if(line.startsWith("LOCK")){
				insertarea = true;
				this.sqlList.add(line);
				
				String tableName = line.split(" ")[2].replaceAll("`", "");
				List<String> sqlList = getTableList(tableName.toUpperCase());
				
//				this.sqlList.addAll(sqlList);
				
			} else if(line.startsWith("UNLOCK")){
				insertarea = false;
			} 
			
			if(!insertarea){
				sqlList.add(line);
			}
			
			if(insertarea){
				insertarea = false;
			}
		}
		
		fIleInterface.writeFile(new File(output), sqlList);
		
		System.out.println("end");
	}
	
	private void writeTableInfo() {
		Iterator<String> keyiterator = tableMap.keySet().iterator();
		while(keyiterator.hasNext()){
			String tableName = keyiterator.next();
			List<String> tableList = tableMap.get(tableName);
			System.out.println("==================" + tableName + "==================");
			for (String string : tableList) {
				System.out.println(string);
			}
		}
	}
	
	public List<String> getTableList(String tableName) {
		List<String> tableList = tableMap.get(tableName);
		
		if(tableList == null){
			tableList = new ArrayList<>();
			tableMap.put(tableName, tableList);
		}
		
		return tableList;
	}
	
	
	public static void main(String[] args) {
		String input = "C:/wnn/workspace/aaa_toolManage/src/db/handler/script.sql";
		String input1 = "C:/wnn/workspace/aaa_toolManage/src/db/handler/Dump20171126.sql";
		String output = "C:/wnn/workspace/aaa_toolManage/src/db/handler/script222.sql";
		ChangeCreateToDelete2 changeCreateToDelete = new ChangeCreateToDelete2(input);
		changeCreateToDelete.start();
		changeCreateToDelete.changeSql(input1, output);
	}
}
