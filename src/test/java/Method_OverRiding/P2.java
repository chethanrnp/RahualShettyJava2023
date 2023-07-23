package Method_OverRiding;

public class P2 extends P1 {
	/*
	 * Extending property of Parent Class
	 */
	public static void main(String[] args) {
		// Creating the Object of Child Class For Fetching The Data
		P1 p = new P2();
		p.audioSystem();
	}

	// Creating new Method In Child Class
	public void engine() {
		System.out.println("Engine I Implemented");
	}

	// Creating the method for color Variable
	public void color() {
		System.out.println(color);
	}

	// Upgrading The Audio System
	public void audioSystem() {
		System.out.println("Audio System IS Upgraded");
	}
}
