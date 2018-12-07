package stringModification;

import java.util.Scanner;

public class CalculateDaysBetTwoDates {
	int dd, mm, yy;
	int month[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public CalculateDaysBetTwoDates(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	private static CalculateDaysBetTwoDates readDate() { // Factory Method
		Scanner sc = new Scanner(System.in);
		int dd = sc.nextInt();
		int mm = sc.nextInt();
		int yy = sc.nextInt();
		return new CalculateDaysBetTwoDates(dd, mm, yy);
	}

	private int getDays() {
		int days = 0;
		int y = this.yy;
		days = y * 365;
		days = days + (y / 4 - y / 100 + y / 400); //To Get Non-Leap Year IN DAYS 
		for (int i = 1; i < month.length; i++) {
			days = days + month[i];
		}
		days = days + this.dd;
		return days;
	}

	public static void main(String[] args) {
		System.out.println("Enter Date 1");
		CalculateDaysBetTwoDates d1 = CalculateDaysBetTwoDates.readDate();
		int daysFromSecondDate = d1.getDays();
		System.out.println("Enter Date 2");
		CalculateDaysBetTwoDates d2 = CalculateDaysBetTwoDates.readDate();
		int daysFromFirstDate = d2.getDays();
		System.out.println("Totdal Days is " + Math.abs(daysFromSecondDate - daysFromFirstDate));
	}

}
