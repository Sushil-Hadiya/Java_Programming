package org.array;

public class CopyExistingArry {
	private static int[] duplicate(int arr[]) {
		int na[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			na[i] = arr[i];
		}
		return na;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		arr = duplicate(arr);
		System.out.println("Duplication is Done : ");
		ReadNdDisplayArry.display(arr);
	}
}
