package array;

class UniqueNumber {
	int arr[] = { 1, 1, 1, 2, 2, 2, 3, 4, 4 };

	void printUnique(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		UniqueNumber obj = new UniqueNumber();
		obj.printUnique(obj.arr);
	}
}
