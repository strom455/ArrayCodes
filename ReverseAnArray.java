package array;

public class ReverseAnArray {
	void reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	void rotateLeftK(int[] arr, int k) {
		int n = arr.length;
		reverseArray(arr, 0, n - k);
		reverseArray(arr, k, n - 1);
		reverseArray(arr, 0, n - 1);

		for (int num : arr) {
			System.out.println(num + " ");
		}
	}

	public static void main(String[] args) {
		
		ReverseAnArray obj = new ReverseAnArray();
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		obj.rotateLeftK(arr, 3);
	}
}
