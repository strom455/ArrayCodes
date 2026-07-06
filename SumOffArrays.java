package Arrays.toString;

import java.util.Arrays;

public class SumOffArrays {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 7, 3, 6 };
		System.out.println(Arrays.toString(arr));

		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		System.out.println("sum " + sum);
	}
}