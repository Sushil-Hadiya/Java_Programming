package org.array;

public class CountPrimeEleInArry {
	private static int countPrimeEle(int arr[]) {
		int prime = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 2; j <= arr[i] / 2; j++) {
				if (arr[i] % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				prime++;
			}
		}
		return prime;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		int prime = countPrimeEle(arr);
		System.out.println("Total prime number's are : " + prime);
	}
}
