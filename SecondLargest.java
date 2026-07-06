package array;

public class SecondLargest {
	void secondlargest() {
	int arr[] = { 10,5,8,20,15};
	int largest = Integer.MIN_VALUE;
	int secondlargest = Integer.MIN_VALUE; 
	
	for (int num : arr) {
		if (num > largest) {
		
		secondlargest = largest;
		largest = num;
		}
	  else if(num>secondlargest&&num!=largest)
	 {
		secondlargest = num;

	}

}
   System.out.println(secondlargest);

}
    
	public static void main(String args[]) {
		SecondLargest obj = new SecondLargest();
		obj.secondlargest();
		
		
		
	}
}