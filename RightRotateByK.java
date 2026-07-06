package array;

public class RightRotateByK {
	void rotate(int arr[], int k) {
		int n = arr.length;
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			int newindex = (i - k + n) % n;
			result[newindex] = arr[i];
		}
		for (int num : result) {
			System.out.println(num + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int k = 3;
		RightRotateByK obj = new RightRotateByK();
		obj.rotate(arr, k);
	}
}