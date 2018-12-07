package patterns;

public class PyramidMutlipleForLoop {

	public static void main(String[] args) {
		int num = ScannerReader.readInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < (num - i); j++) { // for loop -2
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) { // for loop - 3
				System.out.print("*");
			}
			for (int j = 1; j < i; j++) { // for loop - 4
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
/*
	Input : 7
				*
			   ***
			  *****
			 *******
			*********
    	   ***********
*/
