package array;

public class LeftRotate2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] newArr = new int[arr.length];

		newArr[0] = arr[arr.length - 1];

		for (int i = 1; i < newArr.length; i++) {
			newArr[i] = arr[i - 1];

		}
		for (int num : newArr) {
			System.out.println(num + " ");
		}
	}
}
