package matrixPrograms;

public class RawWiseSum {

	private static void getRawWiseSum(int a[][]) {
		int sum;
		for (int i = 0; i < a.length; i++) {
			sum = a[i][0];
			for (int j = 1; j < a[i].length; j++) {
				sum += a[i][j];
			}
			System.out.print(sum + " ");
		}
	}

	public static void main(String[] args) {
		int a[][] = ReadMatrix.readMatrix();
		getRawWiseSum(a);
	}
}
