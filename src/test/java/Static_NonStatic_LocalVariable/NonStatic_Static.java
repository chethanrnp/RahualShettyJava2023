package Static_NonStatic_LocalVariable;

public class NonStatic_Static {

	// Instance Variable
	String name;
	String address;
	// Static Variable used for common data to save memory
	static String place;
	static int i;
	// To know the static Variable and initilise We use static block
	static {
		NonStatic_Static.place = "Banglore";
		NonStatic_Static.i = 0;
	}

	// This are all local Variable
	public NonStatic_Static(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		// Prints total number of object Created
		System.out.println(i);
	}

	public static void main(String[] args) {
		// Creating the Object of a class
		NonStatic_Static obj = new NonStatic_Static("Chtehan", "Vijayanagar");
		NonStatic_Static obj2 = new NonStatic_Static("Arya", "jayanagar");
		System.out.println(obj.getName());
		System.out.println(obj.getPlace());
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPlace() {
		return place;
	}
}
