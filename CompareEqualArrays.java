package Arrays.equel;

import java.util.Arrays;

public class CompareEqualArrays {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int arr1[] = { 3, 2, 1 };
		Arrays.sort(arr);
		Arrays.sort(arr1);
		System.out.println(Arrays.equals(arr, arr1));
	}
}
