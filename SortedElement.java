package array;

public class SortedElement {
	void Sorted(int arr[]) {
		boolean sorted = true;

		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i + 1]) {
				sorted = false;
				break;

			}
		}
		if (sorted) {
			System.out.println(" element is sorted");

		} else {
			System.out.println("element is not sorted");

		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		SortedElement obj = new SortedElement();
		obj.Sorted(arr);
	}
}