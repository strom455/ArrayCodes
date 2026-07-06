package array;

public class AllRepetedNumber {
	void all(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println( " all repet number is " + arr[i]);
					
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 1, 3, 4,};
		AllRepetedNumber obj = new AllRepetedNumber();
		obj.all(arr);
	}
}
