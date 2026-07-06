package array;

import java.util.Scanner;
public class SumOffElement1 {

	  public static void main (String args []) {
	  
	  int[] num = new int[3];
	  int sum = 0;
	  
	  Scanner sc = new Scanner (System.in);
	  
	  for (int i = 0; i <num.length; i++) {
	  System.out.println(" enter a number ");
	  num[i] = sc.nextInt();
	  sum = sum + num[i];
	  
	  }
	  System.out.println("sum = " + sum);
	  
		  
	  }
}
