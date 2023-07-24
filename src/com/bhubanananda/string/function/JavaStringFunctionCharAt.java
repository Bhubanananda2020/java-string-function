package com.bhubanananda.string.function;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Class JavaStringFunctionCharAt.
 *
 * @author Bhubanananda
 */
public class JavaStringFunctionCharAt {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the input");
		String givenInput = sc.nextLine();

		simpleCharAt(givenInput);
		System.out.println();
		System.out.println("=================");
		System.out.println();

		printCharactersAtOddPositionsUsingCharAt(givenInput);
		System.out.println();
		System.out.println("=================");
		System.out.println();

		countingFrequencyOfACharacterUsingCharAt(givenInput);
		System.out.println();
		System.out.println("=================");
		System.out.println();

		countingVowelsNumberUsingCharAt(givenInput);
		System.out.println();
		System.out.println("=================");
		System.out.println();
	}

	/**
	 * Simple char at.
	 *
	 * @param givenInput the given input
	 */
	private static void simpleCharAt(String givenInput) {
		char charAt = givenInput.charAt(0);
		System.out.println(charAt);
	}

	/**
	 * Prints the characters at odd positions using char at.
	 *
	 * @param givenInput the given input
	 */
	private static void printCharactersAtOddPositionsUsingCharAt(String givenInput) {
		System.out.println("Length of name is " + givenInput.length());
		System.out.println();
		for (int i = 0; i < givenInput.length() - 1; i++) {
			if (i % 2 != 0) {
				System.out.println("Char at " + i + " place " + givenInput.charAt(i));
			}
		}
	}

	/**
	 * Counting frequency of A character using char at.
	 *
	 * @param givenInput the given input
	 */
	static void countingFrequencyOfACharacterUsingCharAt(String givenInput) {
		Integer count = 0;
		System.out.println("Length of name is " + givenInput.length());
		System.out.println();
		for (int i = 0; i < givenInput.length(); i++) {
			if (givenInput.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);
	}

	/**
	 * Counting vowels number using char at.
	 *
	 * @param givenInput the given input
	 */
	private static void countingVowelsNumberUsingCharAt(String givenInput) {
		Integer noOfVowels = 0;
		System.out.println("Length of " + givenInput + " is " + givenInput.length());
		System.out.println();

		ArrayList<Character> vowels = new ArrayList<Character>();
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

		for (int i = 0; i < givenInput.length(); i++) {

			for (Character character : vowels) {
				if (givenInput.charAt(i) == character) {
					noOfVowels++;
				}
			}
		}
		System.out.println(noOfVowels);
	}

}
