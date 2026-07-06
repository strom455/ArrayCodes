package array.practice2;

public class EvenNumber {

	public static void main(String[] args) {
		int[] n = { 2, 3, 4, 5, 6, 7, 8, 9, 12 };
		int count = 0;

		for (int i : n) {
			if (i % 2 == 0) {
				count++;
				
			}

		}
		System.out.println(  "even number is " +count);
	}

}
