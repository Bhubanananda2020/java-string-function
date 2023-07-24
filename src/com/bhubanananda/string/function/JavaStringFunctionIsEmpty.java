package com.bhubanananda.string.function;

/**
 * The Class JavaStringFunctionIsEmpty.
 *
 * @author Bhubanananda
 */
public class JavaStringFunctionIsEmpty {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		String s1 = "";
		String s2 = "javatpoint";
		@SuppressWarnings("unused")
		String s3 = null;
		String s4 = "  ";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
//		System.out.println(s3.isEmpty());  //runtime error
		System.out.println(s4.isEmpty());
	}
}