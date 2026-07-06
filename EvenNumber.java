package array;

public class EvenNumber {
	public static void main(String args[]) {
		int[] n = { 5, 2, 3, 4, 6, 9, 10 };
		int count = 0;

		for (int i : n) {

			if (i % 2 == 0) {
				count++;

				System.out.println("even number is " + count);
			}
		}

	}
}
