package array;

import java.util.Scanner;

public class SumOffElement3 {
	public static void main(String args[]) {

		short[] num = new short[3];
		short sum = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			System.out.println(" enter a number ");

			num[i] = sc.nextShort();

			sum = (short) (sum + num[i]);

		}
		System.out.println("sum = " + sum);

	}

}
