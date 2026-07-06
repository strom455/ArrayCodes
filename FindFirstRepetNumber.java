package array;

public class FindFirstRepetNumber {
	void repet(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(" first repet number " + arr[i]);
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 1, 2, 3, 4 };
		FindFirstRepetNumber obj = new FindFirstRepetNumber();
		obj.repet(arr);
	}
}