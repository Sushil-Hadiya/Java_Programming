package matrixPrograms;

public class Rotate90Left {

	private static int[][] getTranspose(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a[i].length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		ReadMatrix.displayMatrix(a);
		return a;
	}

	private static void getLeftRotation(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length / 2; j++) {
				int temp = a[j][i];
				a[j][i] = a[a[j].length - 1 - j][i];
				a[a[j].length - 1 - j][i] = temp;
			}
		}
		ReadMatrix.displayMatrix(a);
	}

	public static void main(String[] args) {
		int a[][] = ReadMatrix.readMatrix();
		System.out.println("Entered Matrix is");
		ReadMatrix.displayMatrix(a);
		System.out.println("After Transpose matrix is ");
		getTranspose(a);
		System.out.println("AFter 90 Degree Left Rotation Matrix is");
		getLeftRotation(a);
	}
}
