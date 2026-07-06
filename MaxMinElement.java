package array.practice2;

public class MaxMinElement {

	public static void main(String[] args) {
		int arr[] = { 10, 22, 45, 3, 7, 8 };
		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("minimum = " + min);
		System.out.println("maximum = " + max);
	}

}
