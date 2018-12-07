package misc;

//Write a JAVA program generate permutations
import java.util.Scanner;

public class Permutation {
	public static void permutation(String str) {
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++) {
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("enter string for permutation ");
		String str = new Scanner(System.in).nextLine();
		permutation(str);
	}
}
