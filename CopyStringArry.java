package Arrays.copyoff;

import java.util.Arrays;

public class CopyStringArry {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 34 };
		String[] names = { "Ravi", "Trilok", "Nandan" };
		String[] copy = Arrays.copyOf(names, names.length);

		System.out.println("Original Array: " + Arrays.toString(names));
		System.out.println("Copied Array: " + Arrays.toString(copy));

	}
}
