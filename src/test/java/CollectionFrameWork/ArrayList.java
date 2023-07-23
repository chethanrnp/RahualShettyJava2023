package CollectionFrameWork;

public class ArrayList {

	public static void main(String[] args) {
		// Creating Object of Array list
		java.util.ArrayList<String> a = new java.util.ArrayList<String>();
		a.add("Chethan");
		a.add("Java");
		System.out.println(a);
		// To add at the specific index
		a.add(0, "Arya");
		System.out.println(a);
		// to get the object at specific index
		System.out.println(a.get(0));
		// to verify whether object is present
		System.out.println(a.contains("Arya"));
		// to know the index of the object
		System.out.println(a.indexOf("Arya"));
		// To check whether the object is present
		System.out.println(a.isEmpty());
		// To check the size of an array
		System.out.println(a.size());
	}

}
