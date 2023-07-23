package Super_This_KeyWord;

public class SuperCalling_InConstructor_Child extends SuperCalling_InConstructor_Parent {
	/*
	 * Super KeyWord In Constructor
	 */
	public SuperCalling_InConstructor_Child(int a) {
		super(a);
		System.out.println("Iam the Child Class Constructor");
	}

	public static void main(String[] args) {
		SuperCalling_InConstructor_Child s = new SuperCalling_InConstructor_Child(1);
	}

}
