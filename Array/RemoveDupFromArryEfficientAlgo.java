package org.array;

//Efficient algorithm to perform this operation
public class RemoveDupFromArryEfficientAlgo {
	public static int[] removeDuplicate(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = arr[n - 1];
					n--;
					j--;
				}
			}
		}
		int no[] = new int[n];
		for (int j = 0; j < no.length; j++) {
			no[j] = arr[j];
		}
		return no;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		arr = removeDuplicate(arr);
		ReadNdDisplayArry.display(arr);
	}
}
