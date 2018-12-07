package matrixPrograms;

public class ColWiseMax {

	private static void getMaxOfCol(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			int max = a[0][i];
			for (int j = 1; j < a[i].length; j++) {
				if (max < a[j][i]) {
					max = a[j][i];
				}
			}
			System.out.println("Max Number for " + (i + 1) + " Column is " + max);
		}
	}

	public static void main(String[] args) {
		int a[][] = ReadMatrix.readMatrix();
		ReadMatrix.displayMatrix(a);
		getMaxOfCol(a);
	}
}
