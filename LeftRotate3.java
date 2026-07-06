package array;

public class LeftRotate3 {
	void left(int[] arr, int k) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length - k; i++) {
			arr1[i] = arr[i + k];

		}
		for (int i = 0; i < k; i++) {
			arr1[(arr1.length - k) + i] = arr[i];
		}
		for (int num : arr1) {
			System.out.println(num + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		LeftRotate3 obj = new LeftRotate3();
		obj.left(arr, 2);
	}
}
