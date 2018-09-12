package org.array;

public class CountDigitInArry {

	private static int countDigit(int[] arr) {
		int digit = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0 && arr[i] <= 9) {
				digit++;
			}
		}
		return digit;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		int digit = countDigit(arr); // 0 to 9 ele in array
		System.out.println("Total Digit Element' are : " + digit);
	}
}