package org.array;

public class CountPerfectEleInArr {

	private static int countPerfect(int[] arr) {
		int countPerfect = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = 1; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					temp = temp + j;
					if (temp > arr[i]) {
						break;
					}
				}
			}
			if (arr[i] == temp) {
				countPerfect++;
			}
		}
		return countPerfect;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		int perfectEle = countPerfect(arr);
		System.out.println("Total Perfect Ele are : " + perfectEle);
	}

}
