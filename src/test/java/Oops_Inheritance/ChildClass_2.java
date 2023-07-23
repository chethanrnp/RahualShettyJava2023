package Oops_Inheritance;

public class ChildClass_2 {
	/*
	 * Multiple Inheritace
	 */
	public static void main(String[] args) {
		// Check the value of i By Creating Object
		ParentClass_3 p1 = new ParentClass_3();
		System.out.println(p1.i);
		// Check the value of i By Creating Object And Up-Casting
		parentClass_2 p2 = new ParentClass_3();
		System.out.println(p2.i);
	}

}
