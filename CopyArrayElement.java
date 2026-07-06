package array.practicewithfuntion3;

public class CopyArrayElement {
	void copyArrayElement(int arr[]) {
		int copy[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];

		}
		System.out.println("copyed array");

		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		CopyArrayElement obj = new CopyArrayElement();
		obj.copyArrayElement(arr);
	}
}
