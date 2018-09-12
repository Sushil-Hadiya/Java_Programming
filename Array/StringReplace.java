package org.array;

public class StringReplace {
	public static void main(String[] args) {
		String text = "ABab";
		char ch[] = text.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				char val = (char) (25 - ch[i] + 'A' * 2);
				System.out.println(val);
			}
			if (ch[i] >= 90 && ch[i] <= 121) {
				char val = (char) (25 - ch[i] + 'a' * 2);
				System.out.println(val);
			}
		}
	}
}
