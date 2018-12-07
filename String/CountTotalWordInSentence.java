package stringModification;

import java.util.Scanner;

public class CountTotalWordInSentence {

	public static void countTotalWords(String st) {
		char ch[] = st.toCharArray();
		int wc = 0;
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				wc++;
			}
		}
		System.out.println(wc);
	}

	public static void main(String[] args) {
		System.out.println("Enter String to count total words in sentence ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		countTotalWords(st);
		sc.close();
	}
}
