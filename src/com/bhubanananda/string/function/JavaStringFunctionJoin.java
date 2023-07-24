package com.bhubanananda.string.function;

/**
 * The Class JavaStringFunctionJoin.
 *
 * @author Bhubanananda
 */
public class JavaStringFunctionJoin {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		String joinString0 = String.join("Hi", "Bhubanananda");
		System.out.println(joinString0);

		String joinString1 = String.join("Hi", "Bhubanananda", "Hello");
		System.out.println(joinString1);

		String joinString2 = String.join(" ", "Bhubanananda", "welcome", "to", "Hello", "World");
		System.out.println(joinString2);

		String joinString3 = String.join("-", "Hi", "Bhubanananda", "welcome", "to", "Hello", "World");
		System.out.println(joinString3);

		String date = String.join("/", "08", "07", "2025");
		System.out.println(date);
		String time = String.join(":", "12", "10", "10");
		System.out.println(time);
	}

}
