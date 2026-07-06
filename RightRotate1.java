package array;

public class RightRotate1 {
	void right(int[] arr, int k) {

		int[] arr1 = new int[arr.length];

		for (int i = 0; i < k; i++) {
			arr1[i] = arr[arr.length - k + i];
		}
		for (int i = 0; i < arr.length - k; i++) {
			arr1[k + i] = arr[i];

		}
		for (int num : arr1) {
			System.out.print(num + " ");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		RightRotate1 obj = new RightRotate1();
		obj.right(arr, 2);
	}
}
