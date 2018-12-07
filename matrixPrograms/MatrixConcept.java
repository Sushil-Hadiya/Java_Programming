package matrixPrograms;

public class MatrixConcept {
	public static void main(String[] args) {
		int aa[][];
		int[][] ab;
		int[][] ac;
		int mat[][];
		mat = new int[3][2];
		mat[1][1] = 456;
		System.out.println(mat.length);
		System.out.println("No of elements in first row " + mat[0]);
		System.out.println("No of elements in second row " + mat[1]);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		int al[][] = { { 23, 64, 23 }, { 56, 78, 89, 20 }, { 56, 78 } };
		for (int i = 0; i < al.length; i++) {
			for (int j = 0; j < al[i].length; j++) {
				System.out.print(al[i][j] + " ");
			}
			System.out.println();
		}
	}
}
