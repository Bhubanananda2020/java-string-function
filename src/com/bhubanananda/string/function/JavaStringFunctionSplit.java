package com.bhubanananda.string.function;

import java.util.Scanner;

/**
 * The Class JavaStringFunctionSplit.
 *
 * @author Bhubanananda
 */
public class JavaStringFunctionSplit {

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

		splitMethod(input);
		System.out.println();
		System.out.println();
		splitWithRegex(input);

	}

	/**
	 * Split with regex.
	 *
	 * @param input the input
	 */
	private static void splitWithRegex(String input) {
		System.out.println("==========splitWithRegex==========");
		for (String string : input.split("\\s", 5)) {
			System.out.println(string);
		}
	}

	/**
	 * Split method.
	 *
	 * @param input the input
	 */
	private static void splitMethod(String input) {
		String[] split = input.split(" ");

		for (String string : split) {
			System.out.println(string);
		}
	}

}
