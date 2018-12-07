package lambdaExpression;

public class MainRunner {

	public static void main(String[] args) {
		Test t1 = new Test();
		First f = new First() {

			@Override
			public void foo() {
				System.out.println("Annonymous Concept : 1 ");

			}
		};
		t1.display(f);

		Test t2 = new Test();
		t2.display(new First() {

			@Override
			public void foo() {
				System.out.println("Annnymous Concept : 2 ");

			}
		});

		Test t3 = new Test();
		First f1 = () -> {
			System.out.println("Lambda Expression : 1 ");
		};
		t3.display(f1);

		Test t4 = new Test();
		t4.display(() -> {
			System.out.println("Lambda Expression : 2 ");
		});

	}

}
