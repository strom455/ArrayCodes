package Arrays.sort;

import java.util.Arrays;

public class LargestElement {
	public static void main(String[] args) {
		int arr[] = { 2, 7, 3, 89, 4 };
		Arrays.sort(arr);
		System.out.println("largest element " + arr[arr.length - 1]);
	}
}
