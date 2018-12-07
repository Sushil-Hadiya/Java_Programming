package org.sorting;

import org.binarySearch.BinarySearch;

public class Selection {

	private static void selection_sort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };
		selection_sort(arr);
		BinarySearch.printArry(arr);
	}
}
