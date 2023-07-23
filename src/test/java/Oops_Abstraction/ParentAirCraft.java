package Oops_Abstraction;

public abstract class ParentAirCraft {
/*
 * Creating Common Method For Using It In Child Class
 */
	public void engine() {
		System.out.println("Follow Engine Guidliness");
	}
    //Concrete method
	public void safetyGuidLiness() {
		System.out.println("Follow Safety Guidliness");
	}
	//Abstract Method
	public abstract void bodyColour();
}
