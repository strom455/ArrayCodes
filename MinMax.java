package array;


public class MinMax {
	public static void main(String args[]) {

		int arr[] = { 5, 2, 5, 8 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];

			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("manimum = " + min);
		System.out.println("maximum =" + max);
	}
}
