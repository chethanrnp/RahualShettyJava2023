package CollectionFrameWork;

import java.util.LinkedHashSet;

public class Practise_ProgramOn_Collection {

	public static void main(String[] args) {
		int[] a = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			ls.add(a[i]);
		}

		System.out.println(ls);
		for (Integer lv : ls) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (lv == a[i]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(lv + "=" + count);
			} else if (count > 1) {
				System.out.println(lv + "=" + count);
			}
		}
	}

}
