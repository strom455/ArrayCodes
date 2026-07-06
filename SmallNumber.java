package array;

public class SmallNumber {
    public static void main (String args []) {
    	
    	int[] num = { 10,2,8,4,5};
        int lowest = num[0];
        
        for ( int i = 1; i <num.length; i++) {
        	
        	if (lowest >num[i]) {
        	lowest = num[i];
        	}
        }
     System.out.println(lowest);
    }
	}

