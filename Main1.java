package array;

import java.util.Scanner;

public class Main1 {
	public static void main(String args[]) {
		int[] num = new int[4];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			System.out.println("enter a number");
			num[i] = sc.nextInt();

		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
