package Arrays.sort;

import java.util.Arrays;
import java.util.Scanner;

public class SortInputByUser {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter 5 numbers:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("sorted array");

		for (int num : arr) {
			System.out.println(num + " ");
		}
		sc.close();
	}
}
