package array;


public class FindMissingNumber {
    void missing(int[] arr, int n) {
    	int expectSum = n *(n + 1)/2;
    	int actualSum = 0;
    	for(int num : arr) {
    		actualSum += num;
    		
    	}
    	System.out.println( expectSum - actualSum);
    }
    public static void main(String[] args) {
		int arr[] = {1,2,4,5};
		FindMissingNumber obj = new FindMissingNumber ();
		obj.missing(arr, 5);
	}
}
    

