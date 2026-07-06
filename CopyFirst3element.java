package Arrays.copyoff;

import java.util.Arrays;

public class CopyFirst3element {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 78 };
		int[] copy = Arrays.copyOf(arr, 3);
		System.out.println(" ori array " + Arrays.toString(arr));
		System.out.println(" copied array " + Arrays.toString(copy));
	}
}
