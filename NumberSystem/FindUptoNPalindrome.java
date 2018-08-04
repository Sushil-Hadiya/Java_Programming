package numberSystemProgramCollection;

import java.util.Scanner;

public class FindUptoNPalindrome {

	static private int isPalindrome(int i) {
		int rev = 0;
		while(i != 0) {
			int rem = i % 10;
			rev = rev * 10 +rem;
			i = i / 10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the Upto number to print Palindrome Number");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int counter = 0;
		System.out.println("Palindrom Number's are : ");
		for (int j = 1; j <= i; j++) {
			int check = isPalindrome(j);
			if(check == j) {
				System.out.print(j +" ");
				counter++;
			}
		}
		System.err.println("\n"+"Total Palindrom Upto "+i+" Number "+counter);
		sc.close();

	}

}
