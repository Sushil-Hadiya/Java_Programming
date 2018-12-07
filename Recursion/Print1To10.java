package recursion;

public class Print1To10 {
	public static void print(int number) {
		System.out.println(number);
		if (number > 1) {
			print(number - 1);
		}
	}
	public static void main(String[] args) {
		print(10);
	}
}
