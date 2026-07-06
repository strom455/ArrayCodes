package array;

import java.util.Scanner;
public class SumOffElement5 {
     public static void main (String args []) {
    	 
     float[] num  = new float[3];
     float sum = 0;
     
     	Scanner sc = new Scanner(System.in);
     	
     	for (int i = 0; i<num.length; i++) {
     	System.out.println("enter a number ");
     	
        num[i] = sc.nextFloat();
        sum = sum + num[i];
        
     	}
     	System.out.println("sum "+ sum );
     
     }
}
