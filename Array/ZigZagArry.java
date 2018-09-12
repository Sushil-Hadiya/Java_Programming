package org.array;

public class ZigZagArry {

	private static int[] zigZag(int arry[], int arry1[]) {
		int zig[] = new int[arry.length + arry1.length];
		for (int i = 0, a1 = 0, b1 = 0; i < zig.length;) {
			if (a1 < arry.length) {
				zig[i] = arry[a1];
				a1++;
				i++;
			}
			if (b1 < arry1.length) {
				zig[i] = arry1[b1];
				b1++;
				i++;
			}
		}
		return zig;
	}

	public static void main(String[] args) {
		int arry[] = ReadNdDisplayArry.readIntArray();
		int arry1[] = ReadNdDisplayArry.readIntArray();
		int newArry[] = zigZag(arry, arry1);
		ReadNdDisplayArry.display(newArry);
	}
}
