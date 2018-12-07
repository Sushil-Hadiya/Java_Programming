package misc;

//Write a program to print numbers from 1 to 100 without using loops
public class Print1To100WithoutLoop {
	private static void printHundred(int n) {
		if (n > 1) {
			printHundred(n - 1);
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		printHundred(100);
	}
}
