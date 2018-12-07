package matrixPrograms;

public class BiggestEleFromPrimaryNDSecondaryDiagonal {

	private static void getBiggestEleFromDiagonal(int a[][]) {
		int primaryDiagonal = 0;
		int secondaryDiagonal = 0;
		if (a.length == a[0].length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i][i] > primaryDiagonal) {
					primaryDiagonal = a[i][i];
				}
				if (a[i][a.length - 1 - i] > secondaryDiagonal) {
					secondaryDiagonal = a[i][a.length - 1 - i];
				}
			}
			System.out.println("Biggest From Primary Diagonal " + primaryDiagonal);
			System.out.println("Biggest From Primary Diagonal " + secondaryDiagonal);
		} else {
			System.out.println("Matrix Must Be IN SQUARE");
		}
	}

	public static void main(final String s[]) {
		int a[][] = ReadMatrix.readMatrix();
		ReadMatrix.displayMatrix(a);
		getBiggestEleFromDiagonal(a);
	}
}
