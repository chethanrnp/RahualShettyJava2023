package Static_NonStatic_LocalVariable;

public class Final_Keyword {
	/*
	 * If we declare class as a final modifier it cannot be extended 
	 * if we declare variable as final it cannot be changed 
	 * if we declare method as final it cannot be overding
	 */
	public static void main(String[] args) {

		final int i = 10;
		System.out.println(i);
	}

	// final modifier method
	final void name() {
      System.out.println("I am the final Block");
	}
}
