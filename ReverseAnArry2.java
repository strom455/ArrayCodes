package array;

public class ReverseAnArry2 {
   void reverseArray( int [] arr, int start, int end ) {
	   while(start < end ) {
		   int temp = arr[start];
		   arr[start] = arr[end];
		   arr[end] = temp;
		   start++;
		   end--;
		   
		   
	   }
   }
   void rotateRight(int[] arr, int k) {
	   int n = arr.length;
	   
	   reverseArray(arr, 0, n - 1);
	   reverseArray(arr, 0, n-1);
	   reverseArray(arr, k, n -1);
	   
	   for( int num : arr) {
		   System.out.println(num + " ");
	   }
   }
   public static void main(String[] args) {
	   ReverseAnArry2 obj = new  ReverseAnArry2 ();
	   int arr[] = {1,2,3,4,5};
	   obj.rotateRight(arr, 2);
}
}
