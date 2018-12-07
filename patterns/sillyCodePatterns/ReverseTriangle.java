package patterns;

public class ReverseTriangle {

	public static void main(String[] args) {
		int num = ScannerReader.readInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= (num - i); j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
/*

	Enter Int value : 
	6
	          * 
	        * * 
	      * * * 
	    * * * * 
	  * * * * * 
	* * * * * * 

*/