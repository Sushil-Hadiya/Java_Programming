package fizzBuzz;

import java.util.Scanner;

public class ArrayReader {

	static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Length : ");
		int length = sc.nextInt();
		System.out.println("Enter The Array Element's");
		int array[] = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		return array;
	}

	static void displayArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + " , ");
		}
	}

	public static void main(String[] args) {
		
	}

}
