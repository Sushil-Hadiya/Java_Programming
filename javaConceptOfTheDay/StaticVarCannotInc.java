package javaConceptOfTheDay;

public class StaticVarCannotInc {

	public int aMethod() {
		int i = 0;
		i++;
		return i;
	}

	public static void main(String[] args) {

		StaticVarCannotInc test = new StaticVarCannotInc();
		test.aMethod();
		int j = test.aMethod();
		System.out.println(j);

	}

}
