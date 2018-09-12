package org.array;

import java.util.Scanner;

public class ReadNdDisplayArry {

	static int[] readIntArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer to create N length of array");
		int n = sc.nextInt();
		System.out.println("Enter element in array ");
		int arry[] = new int[n];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = sc.nextInt();
		}
		return arry;
	}

	static int[] readStringArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer to create N length of array");
		int n = sc.nextInt();
		System.out.println("Enter element in array ");
		int arry[] = new int[n];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = sc.nextInt();
		}
		sc.close();
		return arry;
	}

	static int[] readCharArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer to create N length of array");
		int n = sc.nextInt();
		System.out.println("Enter element in array ");
		int arry[] = new int[n];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = sc.nextInt();
		}
		sc.close();
		return arry;
	}

	public static void display(int arry[]) {
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arry[] = readIntArray();
		display(arry);
	}
}
