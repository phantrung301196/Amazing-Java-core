package org.example.variable;

public class Main {
	public static void main(String[] args) {
		int iNumb = 3;
		double dNumb = 10.0;
		String str = "abc";
		String strRef = new String("abc");

		System.out.println(iNumb);
		System.out.println(dNumb);
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(strRef));
		System.out.println(str == strRef);
		System.out.println(str.equals(strRef));
	}
}
