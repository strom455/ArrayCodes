package array;

public class OccurencesNumber {
	public static void main(String[] args) {

		int[] num = { 10, 20, 10, 50, 10 };
		int target = 10;
		int count = 0;

		for (int n : num) {
			if (n == target) {
				count++;
			}
		}
		System.out.println(count);
	}
}
