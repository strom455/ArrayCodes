package Arrays.compare;

import java.util.Arrays;

public class CompareSortedArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		int arr2[] = { 4, 3, 2, 1 };
		Arrays.sort(arr);
		Arrays.sort(arr2);

		System.out.println(" array1 " + Arrays.toString(arr));
		System.out.println(" array2 " + Arrays.toString(arr2));
		int result = Arrays.compare(arr, arr2);
		System.out.println("compare result " + result);
	}
}
