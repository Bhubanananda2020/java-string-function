package com.bhubanananda.string.function;

import java.util.Scanner;

/**
 * The Class JavaStringFunctionStartsWith.
 *
 * @author Bhubanananda
 */
public class JavaStringFunctionStartsWith {

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

		startsWithMethod(input);
		System.out.println();

		startsWithOffsetMethod(input);
		System.out.println();

	}

	/**
	 * Starts with offset method.
	 *
	 * @param input the input
	 */
	private static void startsWithOffsetMethod(String input) {
		boolean startsWith = input.startsWith("ab", 2);
		System.out.println(startsWith);

	}

	/**
	 * Starts with method.
	 *
	 * @param input the input
	 */
	private static void startsWithMethod(String input) {
		boolean isStartWith = input.startsWith("ab");
		System.out.println(isStartWith);
	}

}
