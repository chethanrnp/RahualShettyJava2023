package Oops_Abstraction;

public class ChildEmirates extends ParentAirCraft {

	public static void main(String[] args) {
     //Creating object of ChildEmirates And Up Casting TO Parent AirCraft
		ParentAirCraft a = new ChildEmirates();
		a.bodyColour();
	}

	//Providing implementation to Parent Class
	@Override
	public void bodyColour() {
		System.out.println("red colour on the body");
	}

}
