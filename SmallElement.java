package array.practice2;

public class SmallElement {

	public static void main(String[] args) {
		int arr[] = { 10, 3, 7, 9, -5 };
		int lowest = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (lowest > arr[i]) {
				lowest = arr[i];
			}

		}
		System.out.println("smallest number is " + lowest);
	}

}