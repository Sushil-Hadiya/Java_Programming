package org.array;

public class InsertEleInExistingArry {
	private static int[] insertEle(int arr[], int index, int element) {
		if (index > arr.length || index < 0) {
			System.out.println("Insertion failed!!!");
			return arr;
		}
		int na[] = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			if (i < index) {
				na[i] = arr[i];
			} else {
				na[i + 1] = arr[i];
			}
		}
		na[index] = element;
		return na;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		arr = insertEle(arr, 3, 100);
		ReadNdDisplayArry.display(arr);
	}
}
