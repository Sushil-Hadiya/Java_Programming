package matrixPrograms;

public class Rotate90Right {

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

	private static void getRightRotation(int a[][]) {
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
		System.out.println("Entered Matrix is ");
		ReadMatrix.displayMatrix(a);
		System.out.println("After Transpose");
		// First Perform the Transpose Of Elements
		a = getTranspose(a);
		System.out.println("After 90 Degree Rotation");
		// After Transpose Get Each Raw in Reverse
		getRightRotation(a);
	}
}
