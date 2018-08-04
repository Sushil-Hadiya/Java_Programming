package numberSystemProgramCollection;

import java.util.Scanner;

public class FactorialNumber {

	static void findFact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println(num + " != " + fact);
	}

	public static void main(String[] args) {
		System.out.println("Enter number to find Factorial Number");
		Scanner sc = new Scanner(System.in);
		int fact = sc.nextInt();
		findFact(fact);
		sc.close();

	}

}
