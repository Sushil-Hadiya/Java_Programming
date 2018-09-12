package org.array;

public class DivByGivenNumb {

	private static int divisibleBye(int[] arr) {
		int div = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0 || arr[i] % 4 == 0 || arr[i] % 5 == 0) {
				div++;
			}
		}
		return div;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		int div = divisibleBye(arr);
		System.out.println("Total Ele Which is Divisible By 3, 4, 5 are : " + div);
	}
}
