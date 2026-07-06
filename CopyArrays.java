package Arrays.copyoff;

import java.util.Arrays;

public class CopyArrays {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int[] copy = Arrays.copyOf(arr, arr.length);

		System.out.println("original arrays " + Arrays.toString(arr));
		System.out.println("copied arrays " + Arrays.toString(copy));
	}
}
