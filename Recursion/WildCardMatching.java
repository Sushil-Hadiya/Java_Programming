package recursion;

public class WildCardMatching {
	public static boolean isMatchRecursive(String s, String p) {
		return isMatchRecursiveUtil(s.toCharArray(), p.toCharArray(), 0, 0);
	}

	public static boolean isMatchRecursiveUtil(char[] text, char[] pattern, int pos1, int pos2) {
		if (pos2 == pattern.length) {
			return text.length == pos1;
		}
		if (pattern[pos2] != '*') {
			if (pos1 < text.length && (text[pos1] == pattern[pos2]) || pattern[pos2] == '?') {
				return isMatchRecursiveUtil(text, pattern, pos1 + 1, pos2 + 1);
			} else {
				return false;
			}
		} else {
			while (pos2 < pattern.length - 1 && pattern[pos2 + 1] == '*') {
				pos2++;
			}
			pos1--;
		}
		while (pos1 < text.length) {
			if (isMatchRecursiveUtil(text, pattern, pos1 + 1, pos2 + 1)) {
				return true;
			}
			pos1++;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isMatchRecursive("xbylmz", "x?y*z"));
	}

}
