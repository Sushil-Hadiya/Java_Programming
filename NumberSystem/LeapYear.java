package generalPrograms.miscellaneous;

import java.util.Scanner;

public class LeapYear {

	private static boolean isLeapYear(int year) {
		boolean flag = false;
		if (year % 400 == 0) {
			flag = true;
		} else if (year % 100 == 0) {
			flag = false;
		} else if (year % 4 == 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println("Enter year To check whether it is Leap Year Or Not");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		boolean res = isLeapYear(year);
		if (res) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " Not a Leap Year");
		}
	}
}
