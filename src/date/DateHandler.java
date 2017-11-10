package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHandler {

	public static String getFormartDate(Date date, String pattern) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		
		String formarted = dateFormat.format(date);
		
		return formarted;
	}
}
