package array;

public class OddNumber {
	public static void main(String args[]) {

		int arr[] = { 2, 5, 6, 7, 9, 13 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {
				count++;
			}
		}
		System.out.println("odd number is " + count);
	}

}