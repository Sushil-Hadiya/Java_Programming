package matrixPrograms;


public class SubOfTwoMatrix {

	private static void getSubOfMatrix(int a[][], int b[][]) {
		int c[][] = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		System.out.println("Substraction Of Two Matrix is : ");
		ReadMatrix.displayMatrix(c);
	}

	public static void main(String[] args) {
		int a[][] = ReadMatrix.readMatrix();
		int b[][] = ReadMatrix.readMatrix();
		getSubOfMatrix(a, b);
	}
}
