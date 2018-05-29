package junit.analyz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JunitErrorAnalyz
{
    public static void main(String[] args)
    {
        try {
            new JunitErrorAnalyz().start("C:\\wnn\\GIB\\Work\\Junit\\新しいテキスト ドキュメント.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void start(String path) throws IOException {
        File file = new File(path);
        if(file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            
            int cnt = 0;
            boolean newBlock = false;
            String javaClassInfo = "";
            JunitErrorInfo errorInfo = null;
            int errorCnt = 1;
            
            while(line != null) {
                if(line.trim().isEmpty()) {
                    cnt ++;

                    line = reader.readLine();
                    continue;
                } else {
                    if(cnt == 3) {
                        if(errorInfo != null) {
                            printInfo(errorInfo);
                        }

                        errorInfo = new JunitErrorInfo();
                        errorInfo.setErrorCnt(errorCnt++);
                        if(line.contains("(")) {
                            errorInfo.setMethod(line);
                            errorInfo.setFilePath(javaClassInfo);
                        } else {
                            javaClassInfo = line;
                            errorInfo.setFilePath(line);
                            newBlock = true;
                        }
                        
                        cnt = 0;
                    } else {
                        if(newBlock) {
                            errorInfo.setMethod(line);
                            newBlock = false;
                        } else {
                            errorInfo.addErrorInfo(line);
                        }
                        
                        cnt = 0;
                    }
                    
                }
                
                line = reader.readLine();
            }
            
        } else {
            System.err.println("File Not Exit:" + path);
        }
    }

    private void printInfo(JunitErrorInfo errorInfo)
    {
        int i = 0;
        for (String error : errorInfo.getErrorList()) {
            if(i == 0) {
                System.out.println(errorInfo.getErrorCnt() + "\t"
                    + errorInfo.getFilePath() + "\t"
                    + errorInfo.getMethod() + "\t"
                    + errorInfo.getError() + "\t"
                    + error);
            } else {
                System.out.println("\t"
                    + "\t"
                    + "\t"
                    + error);
            }
            
            i++;
        }
    }
}
