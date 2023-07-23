package CollectionFrameWork;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		// data stored in the string
		String[] s = { "chethan", "Arya", "Krishna", "Ram" };
		// convert array to array list
		List<String> name = Arrays.asList(s);
		// fetch data from array list
		for (String lv : name) {
			System.out.println(lv);
		}
		// TO find whether data is pressnt
		System.out.println(name.contains("chethan"));
		// to find the size of an array
		System.out.println(name.size());
	}

}
