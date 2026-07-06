package array;

public class SecondSmallestNumber {
	int findSecondSmallest(int arr[]) {
		int smallest = Integer.MAX_VALUE;
		int secondsmallest = Integer.MAX_VALUE;

		for (int num : arr) {
			if (num < smallest) {
				secondsmallest = smallest;
				smallest = num;

			} else if (num < secondsmallest && num != smallest) {
				secondsmallest = num;

			}
		}
		return secondsmallest;

	}

	public static void main(String args[]) {
		int arr[] = { 10, 5, 8, 20, 15 };
		SecondSmallestNumber obj = new SecondSmallestNumber();
		int result = obj.findSecondSmallest(arr);
		System.out.println("second smallest number = " + result);
	}
}
