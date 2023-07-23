package CollectionFrameWork;

import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {
		// Creating the object of HashSet Object
		java.util.HashSet<String> hs = new java.util.HashSet<String>();
		// Adding Object in Array
		hs.add("USA");
		hs.add("INDIA");
		hs.add("UK");
		hs.add("CHINA");
		hs.add("LONDON");
		hs.add("JAPAN");
		System.out.println(hs);
		// Remove the object
		System.out.println(hs.remove("USA"));
		// Size of the Object
		System.out.println(hs.size());
		// Check whether object is empty or not
		System.out.println(hs.isEmpty());

		// Iterator to fetch Data one by one
		Iterator<String> i = hs.iterator();
		while (i.hasNext()) {
			String obj = i.next();
			System.out.println(obj);

		}
	}

}
