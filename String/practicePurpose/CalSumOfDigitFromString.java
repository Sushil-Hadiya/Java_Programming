package practicePurpose;

import java.util.Scanner;

public class CalSumOfDigitFromString {

	public static void sumOfDigit(String st) {
		int sum = 0;
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				sum = sum + (int) (ch[i] - 48);
			}
		}
		System.out.println("Sum is " + sum);
	}

	public static void main(String[] args) {
		System.out.println("Enter String with DIGIT to find out sum of that DIGIT...");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sumOfDigit(str);
		sc.close();
	}
}
