package Package_2;

public class P1 {
	/*
	 * if we need to create object of other class package need to import
	 */

	public static void main(String[] args) {
		// creating object of other class package
		Packages.P1 p = new Packages.P1();
		p.name();
	}

}
