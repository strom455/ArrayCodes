package array.practicewithfuntion3;

public class Frequency {
	void PrintFrequency(int[] arr) {
		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (visited[i]) {
				continue;
			}
			int count = 1;
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

					count++;
					visited[j] = true;

				}
			}

			System.out.println(i + " " + count);
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 4, 5, 6, 6, 7 };
		Frequency obj = new Frequency();
		obj.PrintFrequency(arr);
	}
}
