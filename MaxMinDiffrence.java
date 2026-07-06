package array;

public class MaxMinDiffrence {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 2, 7, 2, 9 };

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}
			if (arr[i] < min) {
				min = arr[i];

			}
		}
		int diff = max - min;
		System.out.println("maximum = " + max);
		System.out.println("minimum = " + min);
		System.out.println("diffrence = " + diff);
	}
}
