package array;

import java.util.Scanner;
public class SumOffElement2 {
    public static void main (String args []) {
    byte[] num = new byte[3];
    byte sum = 0;
    	
    Scanner sc =  new Scanner(System.in);
    
    for ( int i = 0; i < num.length; i++) {
    System.out.println(" enter a number");
    num[i] = sc.nextByte();
    sum = (byte)(sum + num[i]);
   
    }
    System.out.println(" sum " + sum);
    }
	
	
}
