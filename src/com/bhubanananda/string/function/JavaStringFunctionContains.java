package com.bhubanananda.string.function;

import java.util.Scanner;

/**
 * The Class JavaStringFunctionContains.
 *
 * @author Bhubanananda
 */
public class JavaStringFunctionContains {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first String.");
		String firstInput = scanner.nextLine();
		System.out.println("Enter seconnd string.");
		String secondInput = scanner.nextLine();

		simpleContains(firstInput, secondInput);
		System.out.println();
		System.out.println("=========simpleContains========");
		System.out.println();
	}

	/**
	 * Simple contains.
	 *
	 * @param firstInput  the first input
	 * @param secondInput the second input
	 */
	private static void simpleContains(String firstInput, String secondInput) {

		boolean contains = firstInput.contains(secondInput);

		System.out.println(contains);
		System.out.println(firstInput.contains("hello"));

		// Case Sensitive
		System.out.println(firstInput.contains("Testing"));

		// If we are checking with an char then might be result is not accurate
		System.out.println(firstInput.contains("i"));
	}

}
