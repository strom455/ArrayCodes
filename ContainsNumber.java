package array;

public class ContainsNumber {
	public static void main(String args[]) {
		int target = 30;
		int[] num = { 10, 15, 25, 35 };

		boolean found = false;

		for (int n : num) {
			if (n == target) {
				found = true;
				break;
			}
		}
		System.out.println(found ? "found" : "not found ");
	}
}
