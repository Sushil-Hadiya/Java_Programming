package org.array;

//Efficient Algorithm...

public class SumOfUniqueEle {

	private static int addUniqueEle(int[] arr) {
		int sumOfUnique = 0;
		for (int i = 0; i < arr.length; i++) {
			int find = 0;
			for (int j = i + 1; j < arr.length && arr[i] != 0; j++) {
				if (arr[i] == arr[j]) {
					find = 1;
					arr[j] = 0;
				}
			}
			if (find == 0) {
				sumOfUnique += arr[i];
			}
		}
		return sumOfUnique;
	}

	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		int add = addUniqueEle(arr);
		System.out.println("Addition of Unique Ele is : " + add);
	}

}
