package jsp.integrate.bean;

/**
 * @author nannan.c.wang
 *
 */
public class PageTaglibInfo {

	/**
	 * prefix
	 */
	private String prefix;
	
	/**
	 * tagdir
	 */
	private String tagdir;
	
	/**
	 * uri
	 */
	private String uri;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getTagdir() {
		return tagdir;
	}

	public void setTagdir(String tagdir) {
		this.tagdir = tagdir;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	public String getTagUrl(String baseUrl) {
		return baseUrl.replaceAll("\\\\", "/") + tagdir; // TODO the "/"
	}
}
