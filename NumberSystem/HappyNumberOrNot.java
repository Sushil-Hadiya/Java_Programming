package numberSystemProgramCollection;

import java.util.Scanner;

public class HappyNumberOrNot {

	static private int square(int i) {
		return i * i;
	}

	static private void isHappy(int i) {
		int sum = 0;
		while (i != 0) {
			int rem = i % 10;
			sum = sum + square(rem);
			i = i / 10;
		}
		if(sum == 1) {
			System.out.println("Number Is Happy Number :");
		}
		else if(sum >=1 && sum <=9) {
			System.out.println("Number is not Happy Number : ");
		}
		else {
			isHappy(sum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number TO check Number is Happy Or Not :");
		int i = sc.nextInt();
		isHappy(i);
		sc.close();

	}

}
