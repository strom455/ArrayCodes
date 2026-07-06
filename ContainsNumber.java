package array.practicewithfuntion3;

public class ContainsNumber {
	static void containsNumber(int arr[], int num) {
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("number found ");

		} else {
			System.out.println("number is not found ");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 40, 20, 15 };
		containsNumber(arr, 16);
	}
}
