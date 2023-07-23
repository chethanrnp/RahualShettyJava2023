package Date_Class;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date_Time_Using_Calender {
	/*
	 * It is Upgraded Compared to Date
	 */
	public static void main(String[] args) {
		// creating Calender Instance
		Calendar c = Calendar.getInstance();
		// To Get Specific Format
		SimpleDateFormat s = new SimpleDateFormat("MMM/dd/yyy H:mm:ss");
		System.out.println(s.format(c.getTime()));

		// To Get Specific Value
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
	}

}
