package array.practice2;

public class OccurencesNumber {

	public static void main(String[] args) {
    int arr[] = {10,23,4,8,22,4,4};
    int target = 4;
    int count = 0;
    
    for ( int n : arr) {
    	if ( n == target) {
    		count++;
    	}
    }
    System.out.println(count);
	}

}
