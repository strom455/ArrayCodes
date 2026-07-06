package array.practicewithfuntion3;

public class CommanArray {
	void comman() {

		int a[] = { 2, 9, 4, 3, 6 };
		int b[] = { 1, 3, 7, 8, 4 };
		System.out.println("comman elements are ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

	public static void main(String args[]) {

		CommanArray obj = new CommanArray();
		obj.comman();
	}
}