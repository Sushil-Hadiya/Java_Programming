package org.array;

public class CombineOrMergeArry {
	private static int[] combine(int[] arr, int[] arr1) {
		int na[] = new int[arr.length + arr1.length];
		for (int i = 0; i < na.length; i++) {
			if (i < arr.length) {
				na[i] = arr[i];
			} else {
				na[i] = arr1[i - arr.length];
			}
		}
		return na;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		int arr1[] = ReadNdDisplayArry.readIntArray();
		arr = combine(arr, arr1);
		System.out.println("Combine Arry is : ");
		ReadNdDisplayArry.display(arr);
	}

}
