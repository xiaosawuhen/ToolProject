package junit.analyz;

import java.util.ArrayList;
import java.util.List;

public class JunitErrorInfo
{
    private int errorCnt = 0;

    private String filePath;
    
    private String method;
    
    private String error;
    
    private ArrayList<String> errorList = new ArrayList<>();
    
    private StringBuffer errorInfo = new StringBuffer();

    public int getErrorCnt()
    {
        return errorCnt;
    }

    public void setErrorCnt(int errorCnt)
    {
        this.errorCnt = errorCnt;
    }

    public String getFilePath()
    {
        return filePath;
    }

    public void setFilePath(String filePath)
    {
        this.filePath = filePath;
    }

    public String getMethod()
    {
        return method;
    }

    public void setMethod(String method)
    {
        this.method = method;
    }

    public String getError()
    {
        return error;
    }

    public void setError(String error)
    {
        this.error = error;
    }

    public StringBuffer getErrorInfo()
    {
        return errorInfo;
    }

    public void addErrorInfo(String error)
    {
        if(this.error == null) {
            this.error = error;
        }
        this.errorInfo.append(error);
        this.errorList.add(error);
    }
    
    public List<String> getErrorList() {
        return this.errorList;
    }
    
}
