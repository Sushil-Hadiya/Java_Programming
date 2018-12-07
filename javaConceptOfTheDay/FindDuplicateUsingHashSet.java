package javaConceptOfTheDay;

import java.util.HashSet;

public class FindDuplicateUsingHashSet {

	public static void main(String[] args) {
		String[] strArray = { "Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC" };
		HashSet<String> hs = new HashSet<String>();
		for (String str : strArray) {
			if (!hs.add(str)) {
				System.out.println("Duplicate ELE is : " + str);
			}
		}
		System.out.println((int)('a'));

	}

}
