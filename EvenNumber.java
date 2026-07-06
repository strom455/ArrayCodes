package array.practicewithfuntion3;

public class EvenNumber {
	void evenNumber(int arr[]) {
		System.out.println("even number");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}




	public static void main(String[] args) {

		int arr[] = { 10, 20, 23, 24, 5 };
		EvenNumber obj = new EvenNumber();
		obj.evenNumber(arr);

	}
}