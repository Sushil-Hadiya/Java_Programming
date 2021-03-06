package org.sorting;

import org.binarySearch.BinarySearch;

public class MergeTwoSortedArry {

	private static int[] mergeSortedArry(int a[], int b[]) {
		int c[] = new int[a.length + b.length];
		for (int i = 0, m = 0, n = 0; i < c.length; i++) {
			if (m < a.length && n < b.length) {
				if (a[m] < b[n]) {
					c[i] = a[m];
					m++;
				} else {
					c[i] = b[n];
					n++;
				}
			} else if (m < a.length) {
				c[i] = a[m];
				m++;
			} else {
				c[i] = b[n];
				n++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int merge[] = mergeSortedArry(arr, arr1);
		System.out.println("Sorted Arry after merging two sorted arrray is :");
		BinarySearch.printArry(merge);
	}
}
