package Constructor;

public class P1 {
	/*
	 * Diffrent Types of Constructor
	 */
	// Default Constructor
	public P1() {
		System.out.println("I am the default Constructor");
	}

	// Parameterised Constructor
	public P1(int a, int b) {
		System.out.println("I am the Parameterised Constructor");
		int c = a + b;
		System.out.println(c);
	}

	public P1(String al) {
		System.out.println(al);
	}

	public static void main(String[] args) {
		// Object of Default Constructor
		P1 p = new P1();
		// Object of Parameterised Constructor
		P1 p2 = new P1(1, 2);
		P1 p3 = new P1("Chethan");
	}

}
