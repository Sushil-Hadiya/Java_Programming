package org.array;

public class FirstBigNDSecondBigEle {
	// WITHOUT SORTING
	private static void firstSeondBig(int arr[]) {
		int fbig = arr[0];
		int sbig = arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > fbig) {
				sbig = fbig;
				fbig = arr[i];
			} else if (arr[i] > sbig && arr[i] != fbig) {
				sbig = arr[i];
			}
		}
		System.out.println("First Big Ele is : " + fbig);
		System.out.println("Second Big Ele is : " + sbig);
	}

	public static void main(String[] args) {
		int arry[] = ReadNdDisplayArry.readIntArray();
		firstSeondBig(arry);
	}
}
