package array;

public class LeftRotateArray1 {
	void rotate(int arr[]) {
		int temp = arr[0];

		for (int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[arr.length - 1] = temp;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");

		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		LeftRotateArray1 obj = new LeftRotateArray1();
		obj.rotate(arr);
	}
}