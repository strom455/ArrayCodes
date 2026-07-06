package array;

public class RotateLeft {
	void rotate(int arr[]) {
		int first = arr[0];

		for (int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[arr.length - 1] = first;

		for (int num : arr) {
			System.out.println(num + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		RotateLeft obj = new RotateLeft();
		obj.rotate(arr);
	}
}
