import java.util.Scanner;

public class ArmStrongUptoN {

	public static void main(String[] args) {

		System.out.println("Enter the number to print Upto Armstrong");
		Scanner sc = new Scanner(System.in);
		int strong = sc.nextInt();
		int counter = 0;
		for (int i = 1; i <= strong; i++) {
			int reverse = ArmstrongNumber.isArmstrong(i);
			if (reverse == i) {
				System.out.print(i + " ");
				counter++;
			}
		}
		System.out.println();
		System.err.println("Total ArmStrong Number Upto " + strong + " " + counter);
		sc.close();

	}

}
