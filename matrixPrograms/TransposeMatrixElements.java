package matrixPrograms;

public class TransposeMatrixElements {

	private static void getTransposeOfEle(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a[i].length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		System.out.println("After Transpose");
		ReadMatrix.displayMatrix(a);
	}

	public static void main(String[] args) {
		int a[][] = ReadMatrix.readMatrix();
		System.out.println("Before Transpose");
		ReadMatrix.displayMatrix(a);
		getTransposeOfEle(a);

	}
}
