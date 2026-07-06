package array;

public class CopyArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr1 = new int[arr.length];

		for (int index = 0; index < arr.length; index++) {

			arr1[index] = arr[index];
		}
		for (int n : arr1) {
			System.out.println(n);
		}
	}
}
