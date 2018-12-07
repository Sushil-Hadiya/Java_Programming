package matrixPrograms;

public class ColWiseLeastEle {

	private static void getLeastOfCol(int a[][]) {
		int min;
		for (int i = 0; i < a.length; i++) {
			min = Integer.MAX_VALUE;
			for (int j = 0; j < a[i].length; j++) {
				if (min > a[j][i]) {
					min = a[j][i];
				}
			}
			System.out.println("Colummn Wise Least Elements are " + min);
		}
	}

	public static void main(String[] args) {
		int a[][] = ReadMatrix.readMatrix();
		getLeastOfCol(a);
	}
}
