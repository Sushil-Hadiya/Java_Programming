package pattern;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		char a = 'A';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a++ + " ");
			}
			System.out.println();
		}
	}

}
