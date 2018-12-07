package stringModification;

import java.util.Scanner;

public class NumberToSentence {
	private static final String one[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nighteen" };
	private static final String two[] = { "", "", "Twentity", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Nighty" };

	private static void noToWord(int n, String str) {
		if (n < 20) {
			System.out.print(one[n] + " ");
		} else {
			System.out.print(two[n / 10] + " " + one[n % 10] + " ");
		}
		if (n != 0) {
			System.out.print(str + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Nummer to convert into sentence..");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		noToWord(number / 1000 % 100, "Lakh");
		noToWord(number / 1000 % 100, "Thousands");
		noToWord(number / 100 % 10, "Hundred");
		noToWord(number % 100, "");
		sc.close();
	}
}
