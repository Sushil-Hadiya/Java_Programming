package javaConceptOfTheDay;

import java.util.Scanner;

import array.ReadNdDisplay;

public class ConSubArrySum {

	static void pair(int a[], int pair) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == pair) {
					System.out.println(a[i] + " " + a[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplay.readArray();
		System.out.println("ENter number to find out pair : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pair(arr, n);
		sc.close();

	}

}
