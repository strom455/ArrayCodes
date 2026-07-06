package array.practicewithfuntion3;

public class ReverseArray {
	void reverse() {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		ReverseArray obj = new ReverseArray();
		obj.reverse();

	}
}