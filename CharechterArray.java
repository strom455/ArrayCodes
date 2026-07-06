package Arrays.sort;

import java.util.Arrays;

public class CharechterArray {
	public static void main(String[] args) {
		char[] ch = { 'k', 'O', 'L', 'I', 'R', 'T' };
		Arrays.sort(ch);
		for (char c : ch) {
			System.out.print(c + " ");
		}
	}
}