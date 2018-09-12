package org.array;

import java.util.Scanner;

// java program to calculate sum and average of N elements

public class CalculateSumNdAvgOfNEle {
	public static void sumNdAvg(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of Ele is " + sum);
		System.out.println("Avg of Ele is " + sum / arr.length);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer to create N length of array");
		int n = sc.nextInt();
		System.out.println("Enter element in array ");
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sumNdAvg(arr);
		sc.close();
	}
}
