package array.practice2;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		int arr[] = { 10, 3, 5, -16, 7 };
		int positive = 0;
		int negative = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positive++;
			} else {
				negative++;
			}
		}

		System.out.println("positive " + positive);
		System.out.println("negative " + negative);

	}

}
