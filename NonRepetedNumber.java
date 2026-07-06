package array;

public class NonRepetedNumber {
   void nonRepet( int[] arr) {
	   for( int i =0; i < arr.length; i++ ) {
		   int count = 1;
		   for(int j = i + 1; j < arr.length; j ++) {
			   if ( arr[i] == arr[j]) {
				   count++;
			   }
		   }
		   if( count == 1) {
			System.out.println(" non repet " + arr[i]);
			return;
		   }
	   }
   }
   
	   public static void main ( String [] args) {
		   int arr[] = { 1,2,1,3,3};
		   NonRepetedNumber obj = new NonRepetedNumber();
		  obj.nonRepet(arr);
	   }
   }
   

