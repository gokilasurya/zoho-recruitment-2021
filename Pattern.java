package com.zoho.programming.one;

public class Pattern {

	public static void main(String[] args) {
		String str = "welcome";
		String value = "";
		int length = str.length();
		if ((str.length() - 1) % 2 == 1) {
			System.out.println("Enter the Word with odd number of letters");
		} else {
			for (int i = str.length() / 2; i < str.length(); i++) {
				for (int j = 0; j < length; j++) {
					System.out.print(" ");
				}
				length--;
				value += str.charAt(i);
				System.out.print(value);
				System.out.println();
			}
		}
		for (int i = 0; i < str.length() / 2; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(" ");
			}
			length--;
			value += str.charAt(i);
			System.out.print(value);
			System.out.println();
		}
	}

}
