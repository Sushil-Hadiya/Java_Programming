package patterns;

public class Pyramid {

	public static void main(String[] args) {
		int num = ScannerReader.readInt();
		int k = 2 * num - 2;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			k = k - 1;
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}

/*
 
	 Enter Int value : 
	7
            * 
           * * 
          * * * 
         * * * * 
        * * * * * 
       * * * * * * 
      * * * * * * * 

 
 */
