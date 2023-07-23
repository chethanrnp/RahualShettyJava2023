package Date_Class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Time_Upgraded {

	public static void main(String[] args) {
		// Create Date Object
		Date d = new Date();
		// To Get Specific Format
		SimpleDateFormat s = new SimpleDateFormat("MMM/dd/yyy H:mm:ss");
		System.out.println(s.format(d));
		System.out.println(d.toString());
	}

}
