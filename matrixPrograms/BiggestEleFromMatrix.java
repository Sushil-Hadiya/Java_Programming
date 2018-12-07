package matrixPrograms;

public class BiggestEleFromMatrix {

	public static int biggest(int a[][]) {
		int big = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (big < a[i][j]) {
					big = a[i][j];
				}
			}
		}
		return big;
	}

	public static void main(String[] args) {
		int a[][] = ReadMatrix.readMatrix();
		int bigEle = biggest(a);
		System.out.println("Biggest Element from given matrix is : " + bigEle);
	}
}
