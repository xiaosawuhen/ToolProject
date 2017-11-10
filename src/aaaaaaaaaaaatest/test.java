package aaaaaaaaaaaatest;

import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Base64.Encoder;

public class test {

	public static void main(String[] args) {
		String str = "eyJkaXNwbGF5VWlkIjoiMTUyMTAyODMwNzFAMTYzLmNvbSIsIm5hbWUiOiLnpaXpmLMiLCJjdXN0b21lcklEIjoiZmI0Njc5MGUtOWMxOS00ZGExLTkxYWYtNmNjYjlhZTc4Y2M0In0=";
		
		System.out.println(URLEncoder.encode(str) );
	}
}
