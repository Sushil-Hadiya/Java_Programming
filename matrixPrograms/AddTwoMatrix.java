package matrixPrograms;

/*Real-world connection

You have a business selling shirts and pants. The matrices below represent the number of shirts and pants sold in two weeks

Row #1 represents number of pants sold and row #2 represents number of shirts sold from Monday to Friday

For example, you sold 40 pants on Wednesday (week 1).

You sold 28 shirts on Friday (week 2)

How many pants and shirts have you sold in two weeks?*/

public class AddTwoMatrix {

	private static void addMatrix(int a[][], int b[][]) {
		int c[][] = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Sum of Two Matrix is : ");
		ReadMatrix.displayMatrix(c);
	}

	public static void main(String[] args) {
		int a[][] = ReadMatrix.readMatrix();
		int b[][] = ReadMatrix.readMatrix();
		addMatrix(a, b);
	}
}
