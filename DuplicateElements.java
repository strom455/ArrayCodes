package Arrays.sort;

import java.util.Arrays;

public class DuplicateElements {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 5, 7, 8, 4, 8 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++)
			if (arr[i] == arr[i + 1]) {
				System.out.println(arr[i]);
			}
	}
}