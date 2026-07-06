package array.practice2;

public class MaxMinDiffrence {

	public static void main(String[] args) {
		int arr[] = { 6, 7, 9, 24, 34, 21 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		int diffrence = max - min;
		System.out.println("maximum " + max);
		System.out.println("minimum" + min);
		System.out.println("diffrence = " + diffrence);
	}

}
