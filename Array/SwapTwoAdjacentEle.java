package org.array;

public class SwapTwoAdjacentEle {
	private static int[] swap(int arry[]) {
		for (int i = 0; i < arry.length - 1; i += 2) {
			int temp = arry[i];
			arry[i] = arry[i + 1];
			arry[i + 1] = temp;
		}
		return arry;
	}

	public static void main(String[] args) {
		int arry[] = ReadNdDisplayArry.readIntArray();
		System.out.println("Before Swaping");
		ReadNdDisplayArry.display(arry);
		arry = swap(arry);
		System.out.println("\nAfter Swaping");
		ReadNdDisplayArry.display(arry);
	}
}
