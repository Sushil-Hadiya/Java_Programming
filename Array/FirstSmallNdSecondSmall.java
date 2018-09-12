package org.array;

public class FirstSmallNdSecondSmall {

	private static void firstSeondSmallest(int arry[]) {
		int fsmall = arry[0];
		int ssmall = arry[1];
		for (int i = 0; i < arry.length; i++) {
			if (arry[i] < fsmall) {
				ssmall = fsmall;
				fsmall = arry[i];
			} else if (arry[i] < ssmall && arry[i] != fsmall) {
				ssmall = arry[i];
			}
		}
		System.out.println("First Small Ele : " + fsmall);
		System.out.println("Second Small Ele : " + ssmall);
	}

	public static void main(String[] args) {
		int arry[] = ReadNdDisplayArry.readIntArray();
		firstSeondSmallest(arry);
	}
}
