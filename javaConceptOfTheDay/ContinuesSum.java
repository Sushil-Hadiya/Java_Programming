package javaConceptOfTheDay;

import java.util.Arrays;
import java.util.Scanner;

import array.ReadNdDisplay;

public class ContinuesSum {

	static void findSubArry(int a[], int n) {
		int sum = a[0];
		int start = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum - a[i];
			start++;
			if (sum == n) {
				System.out.println("Input Array : "+Arrays.toString(a));
                
                System.out.println("Input Number : "+n);
                 
                System.out.print("Continuous Sub Array : ");
				for (int j = start; j <= i; j++) {
					System.out.println(a[j]);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplay.readArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int input = sc.nextInt();
		findSubArry(arr, input);
		sc.close();

	}

}
