package matrixPrograms;

public class PrimaryDiagonal {

	private static void getPrimaryDiagonal(int a[][]) {
		if (a.length == a[0].length) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i][i] + " ");
			}
			System.out.println();
		} else {
			System.err.println("Matrix must be IN SQUARE");
		}
	}

	private static void getSecondaryDiagonal(int a[][]) {
		if (a.length == a[0].length) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i][a.length - 1 - i] + " ");
			}
			System.out.println();
		} else {
			System.err.println("Matrix must be IN SQUARE");
		}
	}

	public static void main(final String s[]) {
		int a[][] = ReadMatrix.readMatrix();
		System.out.println("Entered Matrix is");
		ReadMatrix.displayMatrix(a);
		System.out.print("Primary Diagonal Elements are : ");
		getPrimaryDiagonal(a);
		System.out.print("Secondary Diagonal Elements Are : ");
		getSecondaryDiagonal(a);
	}
}
