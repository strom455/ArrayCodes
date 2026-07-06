package array;

public class AllPair {
    void all(int[]  arr ) {
    	for( int i =0; i < arr.length; i++) {
    		for( int j = i + 1; j < arr.length; j++) {
    			System.out.println(arr[i] +" " + arr[j]);
    		}
    	}
    }
    public static void main(String[] args) {
		int arr[] = {1,2,3};
		AllPair obj = new AllPair ();
		obj.all(arr);
	}
}
