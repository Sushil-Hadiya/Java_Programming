package org.array;

public class DelFromExistingArry {

	private static int[] deleteEle(int arr[], int index) {
		if (index < 0 || index >= arr.length) {
			System.out.println("Deletion failed!!!");
			return arr;
		}
		int na[] = new int[arr.length - 1];
		for (int i = 0; i < na.length; i++) {
			if (i < index) {
				na[i] = arr[i];
			} else {
				na[i] = arr[i + 1];
			}
		}
		return na;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		arr = deleteEle(arr, 3);
		ReadNdDisplayArry.display(arr);
	}
}
