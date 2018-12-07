package matrixPrograms;

public class ReverseEleRawWise {

	private static void getRawInReverse(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length / 2; j++) {
				int temp = a[i][j];
				a[i][j] = a[i][a[i].length - 1 - j];
				a[i][a[i].length - 1 - j] = temp;
			}
		}
		ReadMatrix.displayMatrix(a);
	}

	public static void main(String[] args) {
		int a[][] = ReadMatrix.readMatrix();
		ReadMatrix.displayMatrix(a);
		getRawInReverse(a);
	}
}
