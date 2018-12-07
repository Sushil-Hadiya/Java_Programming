package stringModification;

import java.util.Arrays;
import java.util.Scanner;

public class CountWordNDSort {

	public static void countWord(String str) {
		int wc = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && str.charAt(i) != ' ' || str.charAt(i) != ' ' && str.charAt(i - 1) == ' ') {
				wc++;
			}
		}
		String arry[] = str.split(" ");
		Arrays.sort(arry);
		int i = 0;
		for (String st : arry) {
			System.out.println(st.toString());
			i++;
		}
		System.out.println("Total word is " + wc+" arrs"+i
				);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String TO COUNT word and Sort that word!!!!!!");
		String str = sc.nextLine();
		countWord(str);
		String replace = str.replaceAll(";", " ").replaceAll(",", " ").replaceAll(".", " ");
		System.out.println(replace);
		sc.close();
	}
}
