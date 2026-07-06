package Arrays.toString;

import java.util.Arrays;

public class CountEvenNUmber {
  public static void main(String[] args) {
	int arr[] = { 45, 62 , 62 , 9 , 7 ,3};
	System.out.println(" arrays" + Arrays.toString(arr));
	
	int count = 0;
	for( int num : arr) {
     if ( num % 2 == 0) {
    	 count++;
     }
     }
	System.out.println(" total even number " + count);
}
}
