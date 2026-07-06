package array.practicewithfuntion3;

public class MoveFirstZero {
	void moveFirst(int[] arr) {

		int counter = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[counter] = arr[i];
				counter--;

			}
		}
		while (counter >= 0) {
			arr[counter] = 0;
			counter--;

		}
		for (int num : arr) {
			System.out.print(num + " -> ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2 ,0, 3 };
		MoveFirstZero obj = new MoveFirstZero();
		obj.moveFirst(arr);
	}
}
