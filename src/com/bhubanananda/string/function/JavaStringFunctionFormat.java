package com.bhubanananda.string.function;

import java.util.Scanner;

/**
 * The Class JavaStringFunctionFormat.
 *
 * @author Bhubanananda
 */
public class JavaStringFunctionFormat {

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

		simpleFormat(firstInput);
		System.out.println();
		System.out.println("=========simpleFormat========");
		System.out.println();

		moreExampleFormat(firstInput);
		System.out.println();
		System.out.println("=========simpleFormat========");
		System.out.println();
	}

	/**
	 * More example format.
	 *
	 * @param firstInput the first input
	 */
	private static void moreExampleFormat(String firstInput) {
		// input -> floating point (except BigDecimal)
		// output - > Hex .
		String sf1 = String.format("name is %a", 12.1f);

		// input -> any
		// output - > "true" if non-null, "false" if null.
		String sf2 = String.format("name is %b", firstInput);

		// input -> character
		// output - > Unicode character
		String sf3 = String.format("name is %c", 'c');

		// input -> integer (incl. byte, short, int, long, bigint)
		// output - > Decimal Integer
		String sf4 = String.format("name is %d", 120);

		// input -> floating point
		// output - > decimal number in scientific notation
		String sf5 = String.format("name is %e", 12.12);

		// input -> floating point
		// output - > decimal number
		String sf6 = String.format("name is %f", 12.12);

		// input -> floating point
		// output - > decimal number, possibly in scientific notation depending on the
		// precision and value.
		String sf7 = String.format("name is %g", 112.12);

		// input -> any type
		// output - > Hex String of value from hashCode() method.
		String sf8 = String.format("name is %h", firstInput);

		// input -> none
		// output - > Platform-specific line separator.
		String sf9 = String.format("name is %n");

		// input -> integer (incl. byte, short, int, long, bigint)
		// output - > Octal number
		String sf10 = String.format("name is %o", 102);

		// input -> any type
		// output - > Hex string.
		String sf11 = String.format("name is %s", firstInput);

		// input -> Date/Time (incl. long, Calendar, Date and TemporalAccessor)
		// output - > %t is the prefix for Date/Time conversions. More formatting flags
		// are needed after this. See Date/Time conversion below.
//		String sf12 = String.format("name is %t", new Date().getDate());

		// input -> integer (incl. byte, short, int, long, bigint)
		// output - > Hex string.
		String sf13 = String.format("name is %x", 101);

		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);
		System.out.println(sf4);
		System.out.println(sf5);
		System.out.println(sf6);
		System.out.println(sf7);
		System.out.println(sf8);
		System.out.println(sf9);
		System.out.println(sf10);
		System.out.println(sf11);
//		System.out.println(sf12);
		System.out.println(sf13);
	}

	/**
	 * Simple format.
	 *
	 * @param firstInput the first input
	 */
	private static void simpleFormat(String firstInput) {

		String sf1 = String.format("name is %s", firstInput);
		String sf2 = String.format("value is %f", 32.33);
		String sf3 = String.format("value is %32.12f", 32.33);

		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);
	}

}
