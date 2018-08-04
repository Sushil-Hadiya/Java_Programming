package numberSystemProgramCollection;

import java.util.Scanner;

public class FibSeriesWithSum {

	private static void fibSeries(int fib) {
		System.out.println("Fib Series are : ");
		int n1 = 1;
		int n2 = 1;
		int n3;
		int sum = 2;
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 0; i <= fib; i++) {
			n3 = n1 + n2;
			sum += n3;
			n1 = n2;
			n2 = n3;
			System.out.print(n3 + " ");
		}
		System.out.println();
		System.err.println("Sum Of Series is = "+sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To print Series : ");
		int fib = sc.nextInt();
		fibSeries(fib);
		sc.close();
	}

}
