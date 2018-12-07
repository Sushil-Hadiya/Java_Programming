package org.binarySearch;

public class BinarySearch {

	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}

	}

	public static void printArry(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static int binarySearch(int[] arr, int ele, int low, int high) {
		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (arr[mid] == ele) {
			return mid;
		}
		if (arr[mid] < ele) {
			return binarySearch(arr, ele, mid + 1, high);
		}
		return binarySearch(arr, ele, low, mid - 1);
	}

	public static void main(String[] args) {
		int arr[] = { 23, 45, 12, 16, 17, 11 };
		int ele = 12;
		bubbleSort(arr);
		printArry(arr);
		int in = binarySearch(arr, ele, 0, arr.length - 1);
		if (in >= 0) {
			System.out.println("Element found at " + in);
		} else {
			System.out.println("Element not found");
		}
	}

}
