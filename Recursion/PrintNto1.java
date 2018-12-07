package recursion;

public class PrintNto1 {
	public static void print(int number) {
		if (number > 1) {
			print(number - 1);
		}
		System.out.println(number);
	}
	public static void main(String[] args) {
		print(10);
	}
}
