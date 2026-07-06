package array;

public class RightArrayRotate2 {
	void right(int[] arr, int k) {
		int n = arr.length;
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			int newindex = (i + k) % n;
			result[newindex] = arr[i];

		}
		for (int num : arr) {
			RightArrayRotate2 obj = new RightArrayRotate2();
			obj.right(arr, k);
		}
	}
}
