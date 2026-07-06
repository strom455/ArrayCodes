package Arrays.toString;

import java.util.Arrays;

public class ArrayWithSmallestElement {
	public static void main(String[] args) {
		int arr[] = { 51, 23, 4, 66, 4, 9 };
		System.out.println("Array: " + Arrays.toString(arr));

		Arrays.sort(arr);

		System.out.println("Smallest Element: " + arr[0]);
	}
}
