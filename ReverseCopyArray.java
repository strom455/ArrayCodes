package array.practicewithfuntion3;

public class ReverseCopyArray {
	void reverse(int[] num) {
		int[] num1 = new int[num.length];

		for (int i = 0; i < num.length; i++) {

			num1[i] = num[num.length - 1 - i];

		}

		for (int n : num1) {
			System.out.println(n);
		}
	}

	public static void main(int[] args) {
		int[] num = { 1, 2, 3, 4 };
		ReverseCopyArray obj = new ReverseCopyArray();
		obj.reverse(num);
	}
}