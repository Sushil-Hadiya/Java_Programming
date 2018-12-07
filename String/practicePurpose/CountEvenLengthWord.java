package practicePurpose;

import java.util.Scanner;

public class CountEvenLengthWord {

	public static void countEvenLengthWord(String st) {
		char[] ch = st.toCharArray();
		int even = 0;
		for (int i = 0; i < ch.length; i++) {
			int c = 0;
			while (i < ch.length && ch[i] != ' ') {
				c++;
				i++;
			}
			if (c > 0 && c % 2 == 0) {
				even++;
			}
		}
		System.out.println(even);
	}

	public static void main(String[] args) {
		System.out.println("Enter Sentence to count even length in word");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		countEvenLengthWord(str);
		sc.close();
	}
}
