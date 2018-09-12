package org.array;

//Unsorted Elements in array

import java.util.Scanner;

//GENERIC METHOD TO FIND Nth HIGHEST ELEMENT FROM ARRAY....
//Q : Mrs, sophia has imported container of shoes. The container has different size of shoes and sophia needs
//to know the second highest shoes size in the container. Could you help sophia by writing a method to find a 
//second highest size of shoe in the container...

public class NThBiggestEle {
	private static int nThBiggestEle(int arr[], int nthHighEle) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					count++;
				}
			}
			if (count == nthHighEle) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int value to find highest Ele in given array : ");
		int count = sc.nextInt();
		sc.close();
		int highEle = nThBiggestEle(arr, count);
		System.out.println(highEle + " is a highest element on given " + count + "th count ");
	}
}
