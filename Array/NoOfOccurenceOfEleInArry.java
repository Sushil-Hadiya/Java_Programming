package org.array;

public class NoOfOccurenceOfEleInArry {
//VERY IMPORTANT QUESTION RELATED TO INTERVIEW QUESTIONS....//
	private static void noOfOccurence(int[] arry) {
		int n = arry.length;
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arry[i] == arry[j]) {
					count++;
					arry[j] = arry[n - 1];
					j--;
					n--;
				}
			}
			System.out.println(arry[i] + " Occures " + count + " Times..");
		}
	}

	public static void main(String[] args) {
		int arry[] = ReadNdDisplayArry.readIntArray();
		noOfOccurence(arry);
	}
}
