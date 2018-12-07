package patterns;

public class TrianglePattern {

	public static void main(String[] args) {
		int num = ScannerReader.readInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
/*
 	Enter Int value : 
	8
	* 
	* * 
	* * * 
	* * * * 
	* * * * * 
	* * * * * * 
	* * * * * * * 
	* * * * * * * * 
 
 */ 
