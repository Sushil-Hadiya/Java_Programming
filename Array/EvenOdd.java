package org.array;

public class EvenOdd {
	private static int[] countEvenOddEle(int arr[]) {
		int evenOdd[] = new int[2];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenOdd[0]++;
			}
			if (arr[i] % 2 != 0) {
				evenOdd[1]++;
			}
		}
		return evenOdd;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		int count[] = countEvenOddEle(arr);
		System.out.println("Total Even number's are : " + count[0]);
		System.out.println("Total Odd number's are : " + count[1]);
	}
}
