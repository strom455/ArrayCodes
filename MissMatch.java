package Arrays.missmatch;

import java.util.Arrays;

public class MissMatch {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 4 };
		int num[] = { 1, 2, 3, 3 };
		int index = Arrays.mismatch(arr, num);
		System.out.println(" missmatch " + index);
	}
}
