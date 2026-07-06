package array;

import java.util.Scanner;
public class SumOffElement4 {
    public static void main (String args []) {
    
    long[] num = new long[3];
    long sum = 0;
    Scanner sc = new Scanner(System.in);
    
    for ( int i = 0; i<num.length; i++) {
    System.out.println(" enter a number ");
    
    num[i] = sc.nextLong();
    
    sum = sum + num[i];
    }
    System.out.println("sum =" +sum);
    }
}
