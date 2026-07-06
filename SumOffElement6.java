package array;

import java.util.Scanner;

public class SumOffElement6 {
	public static void main(String args[]) {

		double[] num = new double[3];
		double sum = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			System.out.println("enter a number");

			num[i] = sc.nextDouble();
			sum = sum + num[i];
		}
		System.out.println("sum " + sum);
		sc.close();
	}
}