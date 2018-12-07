package org.sorting;

import org.binarySearch.BinarySearch;

public class Insertion {

	private static void insertion_sort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			for (; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };
		insertion_sort(arr);
		BinarySearch.printArry(arr);
	}
}
