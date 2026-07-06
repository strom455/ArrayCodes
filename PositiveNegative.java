package array;

public class PositiveNegative {
	public static void main(String args[]) {

		int arr[] = { 5, -2, 6, -3, 4 };

		int posetive = 0;
		int negative = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {
				posetive++;
			} else {
				negative++;
			}
		}
		System.out.println("posetive number is " + posetive);
		System.out.println("negative number is " + negative);
	}
}
