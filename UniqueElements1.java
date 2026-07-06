package array.practicewithfuntion3;

public class UniqueElements1 {

	void UniqueElements1() {
		int arr[] = { 1, 1, 1, 2, 2, 3, 4, 4, 5, };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		UniqueElements1 obj = new UniqueElements1();
		obj.UniqueElements1();
	}

}
