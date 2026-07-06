package array;

public class SortedArray1 {
	void sortedArr(int arr[]) {
		boolean sorted = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				sorted = false;
				break;
			}
		}
		if (sorted) {
			System.out.println("array is sorted ");

		} else {
			System.out.println("array is not sorted");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 9, 7, 5, 2 };
		SortedArray1 obj = new SortedArray1();
		obj.sortedArr(arr);
	}
}
