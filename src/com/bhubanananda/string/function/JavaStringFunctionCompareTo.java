package com.bhubanananda.string.function;

import java.util.Scanner;

/**
 * The Class JavaStringFunctionCompareTo.
 *
 * @author Bhubanananda
 */
public class JavaStringFunctionCompareTo {

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

		byUsingEquals(firstInput, secondInput);
		System.out.println();
		System.out.println("========byUsingEquals=========");
		System.out.println();

		byUsingEqualsSymbol(firstInput, secondInput);
		System.out.println();
		System.out.println("========byUsingEqualsSymbol=========");
		System.out.println();

		byUsingCompareTo(firstInput, secondInput);
		System.out.println();
		System.out.println("=========byUsingCompareTo========");
		System.out.println();

	}

	/**
	 * By using equals.
	 *
	 * @param firstInput  the first input
	 * @param secondInput the second input
	 */
	private static void byUsingEquals(String firstInput, String secondInput) {
		String thirdInput = firstInput;
		String fourthInput = new String(firstInput);
		String fifthInput = "";

//		equals function is a case sensitive
		System.out.println(firstInput.equals(firstInput));
		System.out.println(firstInput.equals(secondInput));
		System.out.println(firstInput.equalsIgnoreCase(secondInput));
		System.out.println(firstInput.equals(thirdInput));
		System.out.println(firstInput.equals(fourthInput));
		System.out.println(firstInput.equalsIgnoreCase(fourthInput));
		System.out.println(firstInput.equals(fifthInput));
	}

	/**
	 * By using equals symbol.
	 *
	 * @param firstInput  the first input
	 * @param secondInput the second input
	 */
	private static void byUsingEqualsSymbol(String firstInput, String secondInput) {
		String thirdInput = firstInput;
		String fourthInput = new String(firstInput);
		String fifthInput = "";
		
//		equals function is a case sensitive
//		System.out.println(firstInput == firstInput);
		System.out.println(firstInput == secondInput);
		System.out.println(firstInput == thirdInput);
		System.out.println(firstInput == fourthInput);
		System.out.println(firstInput == fifthInput);
	}

	/**
	 * By using compare to.
	 *
	 * @param firstInput  the first input
	 * @param secondInput the second input
	 */
	private static void byUsingCompareTo(String firstInput, String secondInput) {
		String thirdInput = firstInput;
		String fourthInput = new String(firstInput);
		String fifthInput = "";
//	    if firstInput > secondInput, it returns positive number  
//	    if firstInput < secondInput, it returns negative number  
//	    if firstInput == secondInput, it returns 0  

		System.out.println(firstInput.compareTo(firstInput));
		System.out.println(firstInput.compareTo(secondInput));
		System.out.println(firstInput.compareTo(thirdInput));
		System.out.println(firstInput.compareTo(fourthInput));
		System.out.println(firstInput.compareTo(fifthInput));
		System.out.println(fifthInput.compareTo(firstInput));
	}
}
