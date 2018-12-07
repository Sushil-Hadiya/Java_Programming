package practicePurpose;

import java.util.Scanner;

public class CountWordStartWithVovels {

	public static void countVovelsWord(String st) {
		int vovels = 0;
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' || ch[i] == 'a'
						|| ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
					vovels++;
				}
			}
		}
		System.out.println(vovels);
	}

	public static void main(String[] args) {
		System.out.println("Enter String to count word which starts with VOVELS");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		countVovelsWord(str);
		sc.close();
	}
}
