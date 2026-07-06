package array.practicewithfuntion3;

public class OccurencesNumber {
	void occurence(int arr[]) {
		int count = 0;
		int num = 20;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;

			}
		}
		System.out.println("occurence of " + num + " = " + count);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 23, 45, 20 };
		OccurencesNumber obj = new OccurencesNumber();
		obj.occurence(arr);
	}
}