package pattern;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (count == 9)
					count = 0;
				System.out.print(++count + " ");

			}
			System.out.println();
		}
	}

}
