package array;

public class MoveZeroToStart {
	void moveZero(int arr[]) {
		int counter = arr.length - 1;
		int[] arr1 = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr1[counter] = arr[i];
				counter--;

			}
		}
		for (int n : arr1) {
			System.out.print(n + " -> ");

		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 3, 0, 4 };
		MoveZeroToStart obj = new MoveZeroToStart();
		obj.moveZero(arr);
	}
}