package com.bhubanananda.string.other;

/**
 * @author Bhubanananda
 *
 */
public class JavaIndexOfVslastIndexOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		last index of 
		String s1 = "this is index of example";// there are 3 'i' characters in this sentence
		int index1 = s1.lastIndexOf('i');// returns last index of 'i' char value
		System.out.println(index1);// 8

		int index2 = s1.indexOf('i');// returns first index of 'i' char value
		System.out.println(index2);// 2

	}
}
