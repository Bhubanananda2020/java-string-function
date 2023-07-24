package com.bhubanananda.string.function;

/**
 * The Class JavaStringFunctionIntern.
 *
 * @author Bhubanananda
 */
public class JavaStringFunctionIntern {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		// It can be used to return string from memory if it is created by a new
		// keyword. It creates an exact copy of the heap string object in the String
		// Constant Pool.

		String s1 = "Bhubanananda";
		String s2 = s1.intern();

		String s3 = new String("Bhubanananda");
		String s4 = s3.intern();

		System.out.println(s1 == s2); // True
		System.out.println(s1 == s3); // False
		System.out.println(s1 == s4); // True
		System.out.println(s2 == s3); // False
		System.out.println(s2 == s4); // True
		System.out.println(s3 == s4); // False

	}

}
