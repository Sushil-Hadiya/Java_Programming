package org.array;

public class SwapHalfArryEle {

	private static void swapHalfArry(int arry[]) {
		for (int i = 0; i < arry.length / 2; i++) {
			int temp = arry[i];
			arry[i] = arry[(arry.length + 1) / 2 + i];
			arry[(arry.length + 1) / 2 + i] = temp;
		}
		ReadNdDisplayArry.display(arry);
	}

	public static void main(String[] args) {
		int arry[] = ReadNdDisplayArry.readIntArray();
		swapHalfArry(arry);
	}
}
