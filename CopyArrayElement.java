package array.practice2;

public class CopyArrayElement {

	public static void main(String[] args) {
    int arr[] = {10,15,23,16,8};
    int arr1[] = new int[arr.length];
    
    for (int i = 0; i < arr.length; i++) {
    	arr1[i] = arr[i];
        			
    }
    for (int n : arr1 ) {
    	System.out.println(n);
    }
	}

}
