/**
 * 
 */
package com.bhubanananda.string.function;

import java.util.Scanner;

/**
 * The Class JavaStringFunctionEndsWith.
 *
 * @author Bhubanananda
 */
public class JavaStringFunctionEndsWith {

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

		simpleEndsWith(firstInput, secondInput);
		System.out.println();
		System.out.println("=========simpleEndsWith========");
		System.out.println();
	}

	/**
	 * Simple ends with.
	 *
	 * @param firstInput  the first input
	 * @param secondInput the second input
	 */
	private static void simpleEndsWith(String firstInput, String secondInput) {

		boolean endsWith = firstInput.endsWith(secondInput);
		System.out.println(endsWith);

		boolean endsWith2 = firstInput.toLowerCase().endsWith(secondInput);
		System.out.println(endsWith2);

		System.out.println(firstInput.endsWith(""));
		System.out.println(firstInput.endsWith(" "));
	}

}
