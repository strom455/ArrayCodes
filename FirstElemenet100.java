package Arrays.copyoff;

import java.util.Arrays;

public class FirstElemenet100 {
	public static void main(String[] args) {
		int arr[] = { 44, 55, 66 };
		int[] copy = Arrays.copyOf(arr, arr.length);

		arr[0] = 100;
		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Copied Array: " + Arrays.toString(copy));
	}
}
