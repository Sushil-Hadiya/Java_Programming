package misc;

import java.util.Scanner;

//Write a JAVA program to reverse a string.
public class ReverseString {

	private static String reverse(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println("Enter String to reverse the string");
		String str = new Scanner(System.in).nextLine();
		str = reverse(str);
		System.out.println(str);
	}
}
