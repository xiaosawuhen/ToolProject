package jsp.integrate.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nannan.c.wang
 *
 */
public class PageInfo {

	/**
	 * baseUrl
	 */
	private String baseUrl;
	
	/**
	 * tagLibList
	 */
	private List<PageTaglibInfo> tagLibList = null;
	
	public PageInfo(String baseUrl) {
		this.baseUrl = baseUrl;
		this.tagLibList = new ArrayList<PageTaglibInfo>();
	}
	
	public void addTaglib(PageTaglibInfo pageTaglibInfo) {
		this.tagLibList.add(pageTaglibInfo);
	}
	
	public String getTaglibUrl(String[] info) {
		String sign = info[0];
		String name = info[1];
		
		String url = null;
		
		for (PageTaglibInfo pageTaglibInfo : tagLibList) {
			if(pageTaglibInfo.getPrefix().trim().equals(sign.trim())) {
				
			}
		}
		
		return url;
	}
}
