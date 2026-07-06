package Arrays.fill;

import java.util.Arrays;

public class FillAndLargest {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Arrays.fill(arr, 500);
		System.out.println(" array " + Arrays.toString(arr));

		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("largest element " + largest);
	}
}
