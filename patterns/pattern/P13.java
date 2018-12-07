package pattern;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = 0; j < n; j++) {
				if (j % 2 != 0) {
					System.out.print("*" + " ");
				} else {
					System.out.print(count++ + " ");
				}
			}
			System.out.println();
		}
	}

}
