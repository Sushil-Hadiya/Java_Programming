package org.array;

import java.util.Scanner;

public class SumOfPairEle {

	private static void sumOfPairEle(int arry[], int sum) {
		for (int i = 0; i < arry.length; i++) {
			for (int j = i + 1; j < arry.length; j++) {
				if (arry[i] + arry[j] == sum) {
					System.out.println("{" + arry[i] + "," + arry[j] + "}");
				}
			}
		}
	}

	public static void main(String[] args) {
		int arry[] = ReadNdDisplayArry.readIntArray();
		System.out.println("Enter the Value to find sum of pair ele in array");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		sumOfPairEle(arry, val);
		sc.close();
	}
}
