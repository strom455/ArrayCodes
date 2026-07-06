package array.practice2;

public class AvaregeNumber {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 33, 45, 23 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		double avg = sum / arr.length;
		System.out.println("avarege is " + avg);
	}

}
