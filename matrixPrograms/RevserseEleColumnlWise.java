package matrixPrograms;

public class RevserseEleColumnlWise {

	private static void getColumnInReverse(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length / 2; j++) {
				int temp = a[j][i];
				a[j][i] = a[a[j].length - 1 - j][i];
				a[a[j].length - 1 - j][i] = temp;
			}
		}
		System.out.println("after Swaping");
		ReadMatrix.displayMatrix(a);
	}

	private static void reverseCol(int a[][]) {
		for (int i = 0; i < a.length / 2; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int temp = a[i][j];
				a[i][j] = a[a.length - 1 - i][j];
				a[a.length - 1 - i][j] = temp;
			}
		}
		ReadMatrix.displayMatrix(a);
	}

	public static void main(String[] args) {
		int a[][] = ReadMatrix.readMatrix();
		ReadMatrix.displayMatrix(a);
		getColumnInReverse(a);
		System.out.println("SECOND WAY TO REVERSE COLUMN");
		reverseCol(a);
	}
}
