package array;

public class ReverseArray2 {

	void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
		

	}

	public static void main(String args[]) {
		int[] num = { 1, 2, 3, 4, 5 };
		ReverseArray2 t = new ReverseArray2();
		t.reverseArray(num);
		for (int n : num) {
			System.out.println(n);
		}

	}

}
