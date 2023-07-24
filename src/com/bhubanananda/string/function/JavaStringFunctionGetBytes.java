package com.bhubanananda.string.function;

/**
 * The Class JavaStringFunctionGetBytes.
 *
 * @author Bhubanananda
 */
public class JavaStringFunctionGetBytes {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String s1 = "ABCDEFG";
		byte[] barr = s1.getBytes();
		for (int i = 0; i < barr.length; i++) {
			System.out.println(barr[i]);
		}
	}

}
