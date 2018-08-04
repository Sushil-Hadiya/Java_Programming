/* An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.
    For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371
*/
import java.util.Scanner;

public class ArmstrongNumber {

	static int qube(int i) {
		return i * i * i;
	}

	static int isArmstrong(int i) {
		int sum = 0;
		while (i != 0) {
			int rem = i % 10;
			sum += qube(rem);
			i /=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number to Check weather armstrong or not : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int arm = isArmstrong(i);
		if(arm == i) {
			System.out.println("Number is ArmStrong ");
		}
		else {
			System.out.println("Number is Not ArmStrong : ");
		}
		sc.close();

	}

}
