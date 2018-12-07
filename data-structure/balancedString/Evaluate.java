package balancedString;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Evaluate {

	public static double evaluate(String str) {
		char[] ch = str.toCharArray();
		Scanner sc = new Scanner(System.in);
		Stack<Double> stk = new Stack<Double>();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90 || ch[i] >= 97 && ch[i] <= 122) {
				System.out.println("enter the " + ch[i] + " Value :");
				double val = sc.nextDouble();
				stk.push(val);
			} else {
				switch (ch[i]) {
				case '+':
					stk.push(stk.pop() + stk.pop());
					break;
				case '-':
					double a = stk.pop();
					double b = stk.pop();
					stk.push(b - a);
					break;
				case '*':
					stk.push(stk.pop() * stk.pop());
					break;
				case '/':
					a = stk.pop();
					b = stk.pop();
					stk.push(b / a);
					break;
				default:
					System.out.println("Envalid Expression..");
				}
			}
		}
		sc.close();
		if (stk.isEmpty()) {
			return 0;
		} else {
			return stk.peek();
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter PostFix Expression Only : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		try {
			double res = evaluate(str);
			System.out.println("Evaluated Results is : " + res);
		} catch (EmptyStackException e) {
			System.out.println("Stack is Empty : ");
		} catch (Exception e) {
			System.out.println("Invalid Expression : ");
		}
		sc.close();
	}
}
