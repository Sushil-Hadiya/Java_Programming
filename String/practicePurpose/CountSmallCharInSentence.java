package practicePurpose;

import java.util.Scanner;

public class CountSmallCharInSentence {

	public static void countSmallLetter(String st) {
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String t = " ";
			int smallLetter = 0;
			while (i < ch.length && ch[i] != ' ') {
				t = t + st.charAt(i);
				if (ch[i] >= 97 && ch[i] <= 122) {
					smallLetter++;
				}
				i++;
			}
			if (smallLetter > 0) {
				System.out.println(t + "->" + smallLetter);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Sentence to count small letter in EACH WORD");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		countSmallLetter(str);
		sc.close();
	}
}
