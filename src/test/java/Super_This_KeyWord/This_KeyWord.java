package Super_This_KeyWord;

public class This_KeyWord {
	/*
	 * this KeyWord Used to initilise the variable int the Contructor
	 */
	int a = 5;

	public void name() {
		int a = 10;
		// preference is given to Local Variable
		System.out.println(a);
		// Used to bring the Value of 'a' used Outside the Class
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		// Creating Object of the class
		This_KeyWord t = new This_KeyWord();
		// Print the Value of a
		t.name();
	}

}
