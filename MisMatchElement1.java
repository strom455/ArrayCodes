package Arrays.missmatch;

import java.util.Arrays;
import java.util.Scanner;

public class MisMatchElement1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.nextLine();
		System.out.println(" name is " + name);

		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(4));
		sc.close();

	}
}
