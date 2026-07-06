package array;
public class EvenIndex {
	public static void main(String args[]) {

		int arr[] = { 0, 2, 3, 5, 6, 7, 9 };

		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}


	}
}

