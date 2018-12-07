package matrixPrograms;

public class RawWiseBigEle {

	public static void getRawWiseBigElements(int a[][]) {
		int rawWise;
		for (int i = 0; i < a.length; i++) {
			rawWise = a[i][0];
			for (int j = 1; j < a[i].length; j++) {
				if (rawWise < a[i][j]) {
					rawWise = a[i][j];
				}
			}
			System.out.print(rawWise + " ");
		}
	}

	public static void main(String[] args) {
		int a[][] = ReadMatrix.readMatrix();
		getRawWiseBigElements(a);
	}
}
