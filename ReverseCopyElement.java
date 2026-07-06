package array.practice2;

public class ReverseCopyElement {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4 };
		int[] num1 = new int[num.length];

		for (int i = 0; i < num.length; i++) {
			num1[i] = num[num.length - 1 - i];

		}
		for (int n : num1) {
			System.out.println(n);
		}
	}

}
