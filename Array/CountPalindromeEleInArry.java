package org.array;

public class CountPalindromeEleInArry {

	private static int countPalindrome(int[] arr) {
		int countPal = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = 0;
			int hold = arr[i];
			while (arr[i] != 0) {
				int rem = arr[i] % 10;
				num = num * 10 + rem;
				arr[i] /= 10;
			}
			if (num == hold) {
				countPal++;
			}
		}
		return countPal;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		int palindrome = countPalindrome(arr);
		System.out.println("Total Palindrome Ele are : " + palindrome);
	}
}
