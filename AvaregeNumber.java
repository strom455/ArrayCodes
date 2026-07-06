package array.practicewithfuntion3;

public class AvaregeNumber {
	void avarege(int arr[]) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		double avg = (double) sum / arr.length;
		System.out.println("avarege " + avg);

	}

	public static void main(String[] args) {
		int arr[] = { 12, 22, 24, 32, 16, 20 };
		AvaregeNumber obj = new AvaregeNumber();
		obj.avarege(arr);
	}

}
