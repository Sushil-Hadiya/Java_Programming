package patterns;

public class SquarePattern {

	public static void main(String[] args) {
		int num = ScannerReader.readInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
/*
 	* * * * * * * 
	* * * * * * * 
	* * * * * * * 
	* * * * * * * 
	* * * * * * * 
	* * * * * * * 
	* * * * * * * 

 */
