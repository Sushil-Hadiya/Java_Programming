package org.array;

//Q : Mrs, sophia has imported container of shoes. The container has different size of shoes and sophia needs
//to know the second highest shoes size in the container. Could you help sophia by writing a method to find a 
//second highest size of shoe in the container...

public class SecondHighWithoutSort {
	private static int secondHighest(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					count++;
				}
			}
			if (count == 1) {
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = ReadNdDisplayArry.readIntArray();
		int second = secondHighest(arr);
		System.out.println("Secon Highest Ele from given array is : " + second);
	}
}
