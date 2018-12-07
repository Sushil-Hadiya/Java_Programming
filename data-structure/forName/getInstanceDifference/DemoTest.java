package org.forName.getInstanceDiffrence;

class Demo {
	public Demo() {
		System.out.println("Hi");
	}
}

class A {
	A() {
		System.out.println("Class A");
	}
}

public class DemoTest {
	public static void main(String[] args)
			throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		Class clazz = Class.forName("org.forName.getInstanceDiffrence.Demo");
		Demo d = (Demo) clazz.newInstance();
		A a = new A();
	}
}
