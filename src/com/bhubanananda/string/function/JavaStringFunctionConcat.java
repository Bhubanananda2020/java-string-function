package com.bhubanananda.string.function;

import java.util.Scanner;

/**
 * The Class JavaStringFunctionConcat.
 *
 * @author Bhubanananda
 */
public class JavaStringFunctionConcat {

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

		simpleConcat(firstInput, secondInput);
		System.out.println();
		System.out.println("=========simpleConcat========");
		System.out.println();

		multipleConcat(firstInput, secondInput);
		System.out.println();
		System.out.println("=========multipleConcat========");
		System.out.println();

	}

	/**
	 * Simple concat.
	 *
	 * @param firstInput  the first input
	 * @param secondInput the second input
	 */
	private static void simpleConcat(String firstInput, String secondInput) {

		firstInput.concat(secondInput);
		System.out.println("String is immutable -> " + firstInput);
		firstInput = firstInput.concat(secondInput);
		System.out.println("Immutable so assign it explicitly -> " + firstInput);

		secondInput = "How to write".concat(secondInput);
		System.out.println("Immutable so assign it explicitly -> " + secondInput);
	}

	/**
	 * Multiple concat.
	 *
	 * @param firstInput  the first input
	 * @param secondInput the second input
	 */
	private static void multipleConcat(String firstInput, String secondInput) {

		firstInput = "How to write".concat(firstInput).concat(" ").concat(secondInput);
		System.out.println("Multiple concat -> " + firstInput);

	}

}
