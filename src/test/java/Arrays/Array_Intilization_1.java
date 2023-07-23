package Arrays;

import java.util.Arrays;

public class Array_Intilization_1 {
	/*
	 * Intilization Of Array Using Array Literal
	 */

	public static void main(String[] args) {
		// Intilization Using Array Literal
		int[] a = { 1, 2, 3, 4, 5 };
		// Fetch Data From Array
		System.out.println(Arrays.toString(a));
		// Or
		int b[] = new int[] { 1, 2, 3, 4, 5 };
		// Fetch Data From Array
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}
}
