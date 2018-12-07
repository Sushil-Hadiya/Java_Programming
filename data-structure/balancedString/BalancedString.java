package balancedString;

import java.util.Scanner;
import java.util.Stack;

public class BalancedString {

	public static boolean isBalance(String str) {
		char ch[] = str.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '{' || ch[i] == '[' || ch[i] == '(') {
				stack.push(ch[i]);
			} else {
				switch (ch[i]) {
				case ']':
					if (stack.pop() != ']')
						return false;
					break;
				case '{':
					if (stack.pop() != '}')
						return false;
					break;
				case ')':
					if (stack.pop() != '(')
						return false;
					break;
				default:
					return false;
				}
			}
		}
		System.out.println(stack.isEmpty());
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check given string is balanced or not");
		String str = sc.nextLine();
		sc.close();
		boolean res = isBalance(str);
		if (res) {
			System.out.println(str + " Is Balananced ...");
		} else {
			System.out.println(str + " Is not Balanced ...");
		}
	}
}
