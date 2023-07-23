package Date_Class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Timeing {
	/*
	 * To get Date And Time Check SimpleDateFormat COde in Google
	 */
	public static void main(String[] args) {
		// Creating the date Object
		Date d = new Date();
		// Convert Into Standard Format MM/DD/YYYY
		String[] d1 = d.toString().split(" ");
		String MM = d1[1];
		String DD = d1[2];
		String YYYY = d1[5];
		System.out.println(MM + "/" + DD + "/" + YYYY);
		// Or
		SimpleDateFormat s = new SimpleDateFormat("MMM/dd/yyy");
		System.out.println(s.format(d));
		// To Get Time
		String time = d1[3];
		System.out.println(time);
		// Or
		SimpleDateFormat s2 = new SimpleDateFormat("H:m:s");
		System.out.println(s2.format(d));
	}

}
