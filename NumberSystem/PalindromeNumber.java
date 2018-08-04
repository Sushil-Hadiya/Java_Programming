package numberSystemProgramCollection;

import java.util.Scanner;

public class PalindromeNumber {

	static private void isPalindrome(int i) {
		int pal = i;
		int sum = 0;
		while(i != 0) {
			int rem = i % 10;
			sum = sum * 10 + rem;
			i = i /10;
		}
		if(sum == pal) {
			System.out.println("Number is Palindrom");
		}
		else {
			System.out.println("Number is not palindrom");
		}
	}
	
	public static void main(String[] args) {

		System.out.println("Enter the number to print Palindrome Number");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		isPalindrome(i);
		sc.close();

	}

}
