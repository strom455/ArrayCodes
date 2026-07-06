package array.practicewithfuntion3;

public class MaxMinDiffrence {
	void maxMin(int arr[]) {
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
		System.out.println("maiximum number is " + max);
		System.out.println("minimum number is " + min);

	}

	public static void main(String[] args) {
		int arr[] = { 10, 12, 6, 7, 8, 9 };
		MaxMinDiffrence obj = new MaxMinDiffrence();
		obj.maxMin(arr);
	}

}
