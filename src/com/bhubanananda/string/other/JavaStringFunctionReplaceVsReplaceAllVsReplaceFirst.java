package com.bhubanananda.string.other;

import java.util.Scanner;

/**
 * The Class JavaStringFunctionReplaceVsReplaceAllVsReplaceFirst.
 *
 * @author Bhubanananda
 */
public class JavaStringFunctionReplaceVsReplaceAllVsReplaceFirst {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// take 1st string from user
		System.out.println("Enter 1st string :");
		String input = sc.nextLine();

		replaceMethod(input);
		System.out.println();

		replaceAllMethod(input);
		System.out.println();

		replaceFirstMethod(input);

	}

	/**
	 * Replace method.
	 *
	 * @param input the input
	 */
	private static void replaceMethod(String input) {
		System.out.println(input);
		String replace = input.replace('a', '0');
		System.out.println("Using replaceMethod method -> " + replace);
	}

	/**
	 * Replace first method.
	 *
	 * @param input the input
	 */
	private static void replaceFirstMethod(String input) {
		System.out.println(input);
		String replace = input.replaceFirst("a", "0");
		System.out.println("Using replaceFirstMethod method -> " + replace);
	}

	/**
	 * Replace all method.
	 *
	 * @param input the input
	 */
	private static void replaceAllMethod(String input) {
		System.out.println(input);
		String replace = input.replaceAll("a", "0");
		System.out.println("Using replaceAllMethod method -> " + replace);
	}

}
