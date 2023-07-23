package CollectionFrameWork;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		// Creating object of HashMap
		java.util.HashMap<Integer, String> hs = new java.util.HashMap<Integer, String>();
		hs.put(0, "Chethan");
		hs.put(1, "Arya");
		hs.put(2, "Cricket");
		hs.put(3, "Tennis");
		hs.put(4, "BaseBall");
		System.out.println(hs.containsValue("Arya"));
		// To get key And Value one by one
		for (Entry<Integer, String> lv : hs.entrySet()) {
			System.out.println(lv.getKey() + "=" + lv.getValue());
		}

		// Converting hashmap to set
		Set<Entry<Integer, String>> set = hs.entrySet();
		Iterator<Entry<Integer, String>> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getKey() + "=" + it.next().getValue());
		}
	}

}
