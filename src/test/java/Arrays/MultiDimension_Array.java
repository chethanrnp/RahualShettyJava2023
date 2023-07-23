package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class MultiDimension_Array {

	public static void main(String[] args) {
		// Used Store the Data in the form of Matrix
		int[][] a = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		// OR Storing Using Array Litral
		int[][] b = { { 2, 4, 5 }, { 3, 4, 7 } };

		// Fetch the Data from Multi Dimension Array
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]);
				// To give the Space
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("++++++++++++++");
		// Storing StingValue Using Array Literal
		String[][] c = { { "chethan", "Aray", "lofer" }, { "chetha", "Aray", "lofer" } };

		// Fetch the Data From String Matrix
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
