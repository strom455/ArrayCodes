package Arrays.equel;

import java.util.Arrays;

public class CheakArrayEquality {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		int arr2[] = { 10, 20, 30, 40 };
		if (Arrays.equals(arr, arr2)) {
			System.out.println("arrays are equal");

		} else {
			System.out.println(" arrys are not equal");
		}
	}
}
