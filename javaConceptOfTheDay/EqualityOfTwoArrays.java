package javaConceptOfTheDay;

import array.ReadNdDisplay;

public class EqualityOfTwoArrays {

	static boolean equality(int a[], int b[]) {
		if (a.length != b.length) {
			return false;
		}
		boolean res = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					res = true;
				} else {
					res = false;
				}
			}
		}
		return res;

	}

	public static void main(String[] args) {
		int arr1[] = ReadNdDisplay.readArray();
		int arr2[] = ReadNdDisplay.readArray();
		boolean res = equality(arr1, arr2);
		if (res)
			System.out.println("Both Array Are equal");
		else
			System.out.println("Both Array Are Not Equal");

	}

}
