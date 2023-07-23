package Oops_Inheritance;

public class ChildClass extends ParentClass {
	/*
	 * Extending property of Parent Class
	 */
	public static void main(String[] args) {
		// Creating the Object of Child Class For Fetching The Data
		ChildClass c = new ChildClass();
		c.color();
		c.brakes();
		c.engine();
		c.audioSystem();
	}

	// Creating new Method In Child Class
	public void engine() {
		System.out.println("Engine I Implemented");
	}

	// Creating the method for color Variable
	public void color() {
		System.out.println(color);
	}

}
