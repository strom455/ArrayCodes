package array.practicewithfuntion3;

public class MaxMinElement {
	void maxMinElement(int arr[]) {
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
		System.out.println("max element " + max);
		System.out.println("min element " + min);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 403, 56 };
		MaxMinElement obj = new MaxMinElement();
		obj.maxMinElement(arr);
	}
}