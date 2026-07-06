package array.practicewithfuntion3;

public class OddNumber {
	void odd(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String args[]) {
		int arr[] = { 10, 15, 20, 25, 16, 15 };
		OddNumber obj = new OddNumber();
		obj.odd(arr);

	}
}