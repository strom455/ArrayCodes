package array;

public class AllDuplicates {
	void duplicate(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			boolean printed = false;
			for (int k = 0; k < i; k++) {
				if (arr[k] == arr[i]) {
					printed = true;
					break;
				}
			}
			if (printed)
				continue;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 4, 2, 3, 6 };
		AllDuplicates obj = new AllDuplicates();
		obj.duplicate(arr);
	}
}
