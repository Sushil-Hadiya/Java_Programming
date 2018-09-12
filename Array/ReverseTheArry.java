package org.array;

public class ReverseTheArry {
	// EFFICIENT ALGORITHM...
	private static int[] reverseArry(int arry[]) {
		for (int i = 0; i < arry.length / 2; i++) {
			int temp = arry[i];
			arry[i] = arry[arry.length - 1 - i];
			arry[arry.length - 1 - i] = temp;
		}
		return arry;
	}

	public static void main(String[] args) {
		int arry[] = ReadNdDisplayArry.readIntArray();
		ReadNdDisplayArry.display(reverseArry(arry));
		
	}
}
