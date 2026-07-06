package array.practice2;

public class SecondLargestElement {
  void secondLargestElement(int [] arr) {
	  
	  int largest = Integer.MIN_VALUE;
	  int secondlargest = Integer.MIN_VALUE;
	  
	  for ( int num : arr) {
		  if ( num > largest ) {
			  secondlargest = largest;
			  largest = num;
			  
		  }
		  else if (num > secondlargest && num != largest) {
			  secondlargest = num;
			  
		  }
		}
	  System.out.println(secondlargest);
	  
  }  
   public static void main(String[] args) {
	   int arr[] = {10,20,5,8,15};
 	   SecondLargestElement obj = new SecondLargestElement();
	   obj.secondLargestElement(arr);
	   }
}
