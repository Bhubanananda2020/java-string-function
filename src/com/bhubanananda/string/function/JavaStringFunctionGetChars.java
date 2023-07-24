package com.bhubanananda.string.function;

/**
 * The Class JavaStringFunctionGetChars.
 *
 * @author Bhubanananda
 */
public class JavaStringFunctionGetChars {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String str = new String("hello Bhubanananda how r u");
		char[] ch = new char[16];
		try {
			str.getChars(6, 18, ch, 2);
			System.out.println(ch);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
