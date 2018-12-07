package skillenza;

import java.util.Scanner;

public class Scrabble {

	public static long getFact(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

	public static long getVal(String st) {
		char ch[] = st.toCharArray();
		int n = ch.length;
		long add = 1;
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = ch[n - 1];
					j--;
					n--;
					count++;
				}
			}
			if (count != 1) {
				add *= getFact(count);
			}
		}
		long getFinalDigit = 0;
		if (st.length() == n) {
			getFinalDigit = getFact(st.length());
		} else {
			getFinalDigit = getFact(st.length());
			getFinalDigit = getFinalDigit / add;
		}
		return getFinalDigit;
	}

	public static long[] getPermute(String st[]) {
		long ans[] = new long[st.length];
		for (int i = 0; i < st.length; i++) {
			if (st[i].length() >= 1 && !st[i].equals("haha")) {
				ans[i] = getVal(st[i]);
			} else {
				ans[i] = -1;
			}

		}
		return ans;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 2 && n <= 1000) {
			String st[] = new String[n];
			for (int i = 0; i < n; i++) {
				String str = sc.next();
				if (str.length() >= 1 && str.length() <= 10000) {
					st[i] = str;
				} else {
					st[i] = "haha";
				}
			}
			long arry[] = getPermute(st);
			for (int i = 0; i < arry.length; i++) {
				System.out.println(arry[i]);
			}
			sc.close();
		}
	}
}
