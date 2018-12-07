package matrixPrograms;

import java.util.Scanner;

public class ReadMatrix {
	public static int[][] readMatrix() {
		System.out.println("Enter Size of matrix you want to create ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int sum[][] = new int[row][col];
		System.out.println("Enter the values for the " + row * col + " Size Matrix");
		for (int i = 0; i < row; i++) {
			System.out.println("Elements for row no " + (i + 1));
			for (int j = 0; j < col; j++) {
				sum[i][j] = sc.nextInt();
			}
		}
		return sum;
	}

	public static void displayMatrix(int mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
