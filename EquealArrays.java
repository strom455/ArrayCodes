package Arrays.equel;

import java.util.Arrays;

public class EquealArrays {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		int arr1[] = { 1, 2, 3, 4 };

		boolean result = Arrays.equals(arr, arr1);
		System.out.println(result);
	}
}
