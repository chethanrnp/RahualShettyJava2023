package Super_This_KeyWord;

public class Super_Child extends Super_Parent {
	/*
	 * Super KeyWord to Get Parent Data When there Common Method name Or Variable
	 */
	String name = "Arya";

	public void getData() {
		System.out.println("I am Child Class");
		// To Print Parent Class Method Of Same name
		super.getData();
	}

	public void getStringData() {
		// Prints Child Class variable Bec of Local Variable
		System.out.println(name);
		// To get Parent Class Variable
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// Creating Object of Child Class
		Super_Child s = new Super_Child();
		// To Get String Value
		s.getStringData();
		// To Print method
		s.getData();
	}

}
