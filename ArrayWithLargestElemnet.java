package Arrays.toString;

import java.util.Arrays;

public class ArrayWithLargestElemnet {
	public static void main(String[] args) {
		int[] arr = { 55, 9, 75, 21, 54, 14 };
		System.out.println("array " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("largest element " + arr[arr.length - 1]);
	}
}
