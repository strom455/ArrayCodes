package array.practice2;

public class ContainsNumber {

	public static void main(String[] args) {
		int arr[] = { 10, 34, 22, 10, 10 };
		int target = 24;

		boolean found = false;
		for (int n : arr) {
			if (n == target) {
				found = true;
				break;
			}

		}
		System.out.println(found ? "found" : "not found ");
	}
}
