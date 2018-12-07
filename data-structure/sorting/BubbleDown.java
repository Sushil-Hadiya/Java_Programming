package org.sorting;

import org.binarySearch.BinarySearch;

public class BubbleDown {

	private static void bubble_sort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };
		bubble_sort(arr);
		BinarySearch.printArry(arr);
	}

}
