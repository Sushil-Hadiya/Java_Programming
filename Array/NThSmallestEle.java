package org.array;

import java.util.Scanner;
//Unsorted Elements in array
public class NThSmallestEle {
	private static int nThSmallest(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					count++;
				}
			}
			if (count == n) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int value to find Smallest Ele in given array : ");
		int count = sc.nextInt();
		sc.close();
		int highEle = nThSmallest(arr, count);
		System.out.println(highEle + " is a Smallest element on given " + count + "th count ");
	}
}
