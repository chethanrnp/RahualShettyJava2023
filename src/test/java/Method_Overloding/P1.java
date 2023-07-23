package Method_Overloding;

public class P1 {

	// Function Overloding Or Method Overloding

	public void getData(int a) {
		System.out.println(a);
	}

	public void getData(String a) {
		System.out.println(a);
	}

	public void getData(int a, int b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		// Creating the object of the class
		P1 p = new P1();
		// Passing int Value
		p.getData(7);
		// Passing String Value
		p.getData("Arya");
		// passing two argument method
		p.getData(5, 10);
	}
}
