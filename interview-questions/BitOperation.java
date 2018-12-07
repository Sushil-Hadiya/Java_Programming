package misc;

public class BitOperation {
	public static int addTwoNumbersWithoutArithmeticOperatorFaster(int num1, int num2) {
		while (num2 != 0) {
			int carry = num1 & num2;
			System.out.println("Carry is : " + carry);
			num1 = num1 ^ num2;
			System.out.println("num1 is : " + num1);
			num2 = carry << 1;
			System.out.println("num2 is : " + num2);
		}
		return num1;
	}
	public static void main(String[] args) {
		System.out.println(addTwoNumbersWithoutArithmeticOperatorFaster(3, 4));
	}
}
