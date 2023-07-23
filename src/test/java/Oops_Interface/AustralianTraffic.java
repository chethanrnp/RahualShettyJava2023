package Oops_Interface;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {
	/*
	 * providing implementation to Central traffic
	 */
	public static void main(String[] args) {
		// creating the object of the class to implement Central Traffic Interface
		CentralTraffic a = new AustralianTraffic();
		a.flashYellow();
		a.greenGo();
		a.redStop();
		// creating the object of the class to implement ContinentalTraffic Interface
		ContinentalTraffic a1 = new AustralianTraffic();
		a1.zebraSimbol();
	}

	// implementing all the methods in the central traffic
	public void greenGo() {
		System.out.println("greengo implementation");
	}

	public void redStop() {
		System.out.println("redstop implementation");
	}

	public void flashYellow() {
		System.out.println("flashYellow implementation");
	}

	// implementing all the methods int the continentalTraffic
	public void zebraSimbol() {
		System.out.println("zebrasimblo implementation");

	}

}
