package org.array;

public class EvenOddEle {
	private static int countEvenEle(int arr[]) {
		int even = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			}
		}
		return even;
	}

	private static int countOddEle(int arr[]) {
		int odd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				odd++;
			}
		}
		return odd;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		int evenCount = countEvenEle(arr);
		int oddCount = countOddEle(arr);
		System.out.println("Total Even Ele in Array is -> " + evenCount);
		System.out.println("Total Odd Ele in Array is -> " + oddCount);
	}
}
