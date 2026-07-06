package Arrays.sort;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 8, 5, 7 };
		Arrays.sort(arr);
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
