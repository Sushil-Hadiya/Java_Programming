package lambdaExpression;

public class FooImplementation {

	public static void main(String[] args) {
		First f = new First() {

			@Override
			public void foo() {
				System.out.println("Annonymous Class");

			}
		};
		f.foo();

		System.out.println("Lambda Expression Concept : ");

		First f1 = () -> {
			System.out.println("First Exp of LAMBDA");
		};
		f1.foo();

	}

}
