package com.bhubanananda.string.function;

import java.util.Scanner;

/**
 * The Class JavaStringFunctionSubstring.
 *
 * @author Bhubanananda
 */
public class JavaStringFunctionSubstring {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// take 1st string from user
		System.out.println("Enter string :");
		String input = sc.nextLine();

		substringMethod(input);
		System.out.println();

	}

	/**
	 * Substring method.
	 *
	 * @param input the input
	 */
	private static void substringMethod(String input) {
		String substring = input.substring(2);
		System.out.println(substring);
		System.out.println();
		System.out.println();
		String substring2 = input.substring(2, 4);
		System.out.println(substring2);
	}

}
