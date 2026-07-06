package array;

public class LeftBy1K {
	void rotate(int[] arr) {
		int first = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[arr.length - 1] = first;
	}

	void rotateLeft(int[]num, int k) {
		for (int i = 0; i < k; i++) {
			rotate(num);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		LeftBy1K obj = new LeftBy1K();
		obj.rotateLeft(arr, 2);
		for (int n : arr) {
			System.out.println(n + " ");
		}
	}
}
