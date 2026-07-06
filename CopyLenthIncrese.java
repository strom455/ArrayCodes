package Arrays.copyoff;

import java.util.Arrays;

public class CopyLenthIncrese {
	public static void main(String[] args) {
		int arr[] = { 55, 88, 99, 55, 44, 1 };
		int[] copy = Arrays.copyOf(arr, 10);
		System.out.println(" original array " + Arrays.toString(arr));
		System.out.println(" copied array " + Arrays.toString(copy));
	}
}
