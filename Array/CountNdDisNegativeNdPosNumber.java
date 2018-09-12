package org.array;

public class CountNdDisNegativeNdPosNumber {
	private static int[] countNegNdPos(int arr[]) {
		int negPos[] = new int[2];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negPos[0]++;
				System.out.print("Negative numbers are : " + arr[i]);
				System.out.println();
			} else {
				negPos[1]++;
				System.out.print("Positive numbers are : " + arr[i]);
				System.out.println();
			}
		}
		System.out.println();
		return negPos;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		int number[] = countNegNdPos(arr);
		System.out.println("Total Negative numbers are :" + number[0]);
		System.out.println("Total Positive numbers are :" + number[1]);
	}
}
