package pattern;

public class P25 {

	public static void main(String[] args) {
		int n = 5;
		int count = 0;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i; j++) {

				System.out.print(++count + " ");
				if (count == 9) {
					count = 0;
				}
			}
			System.out.println();
		}
	}

}
