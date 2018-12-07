package fizzBuzz;

public class FizzBuzz {

	static void fizzBuzz(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 == 0 && a[i] % 5 == 0) {
				System.out.println("FizzBuzz" + " ");
			} else if (a[i] % 3 == 0) {
				System.out.print("Fizz" + " ");
			} else if (a[i] % 5 == 0) {
				System.out.print("Buzz" + " ");
			} else {
				System.out.print(a[i] + " ");
			}
		}
	}

	// What if number increase
	// Improvement in this algorithm

	static void fizzBuzzImproved(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 15 == 0) {
				System.out.print("FizzBuzz" + " ");
			} else if (a[i] % 3 == 0) {
				System.out.print("Fizz" + " ");
			} else if (a[i] % 5 == 0) {
				System.out.print("Buzz" + " ");
			} else {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
//		int array[] = ArrayReader.readArray();
//		fizzBuzz(array);
		int j = 1;
		int arry[] = new int[100];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = j;
			j++;
		}
		fizzBuzzImproved(arry);
	}

}
