package array;

public class MoveArray {

	void moveArray(int[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[counter] = arr[i];
				counter++;
			}
		}
		while (counter < arr.length) {
			arr[counter] = 0;
			counter++;      

		}
		for (int num : arr) {
			System.out.print(num + " -> ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 0, 2, 0, 3, };
		MoveArray obj = new MoveArray();
		obj.moveArray(arr);

	}
}
