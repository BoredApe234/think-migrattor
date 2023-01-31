package com.mps.think.setup.utils;

import java.util.ArrayList;
import java.util.List;

import io.jsonwebtoken.lang.Arrays;

public class IntegerToRoman {
	public static String intToRoman(int num) {
		System.out.println("Integer: " + num);
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanLetters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder roman = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				num = num - values[i];
				roman.append(romanLetters[i]);
			}
		}
		System.out.println("Corresponding Roman Numerals is: " + roman.toString());
		return roman.toString();
	}

	public static String intToSmallRoman(int num) {
		System.out.println("Integer: " + num);
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanLetters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder roman = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				num = num - values[i];
				roman.append(romanLetters[i]);
			}
		}
		System.out.println("Corresponding Roman Numerals is: " + roman.toString().toLowerCase());
		return roman.toString().toLowerCase();
	}

	public static String intToabcd(int n) {
		System.out.println("Integer: " + n);
		String value = null;
		if (n > 0 && n < 27) {
			char ch = (char) (n + 64);
			value = "" + ch;
			System.out.println("Corresponding letter = " + value.toLowerCase());
		} else {
			System.out.println("Please enter a number in 1 to 26 range");
			return "";
		}
		return value.toLowerCase();
	}

	public static String intToABCD(int n) {
		System.out.println("Integer: " + n);
		String value = null;
		if (n > 0 && n < 27) {
			char ch = (char) (n + 64);
			value = "" + ch;
			System.out.println("Corresponding letter = " + value.toUpperCase());
		} else {
			System.out.println("Please enter a number in 1 to 26 range");
			return "";
		}
		return value.toUpperCase();
	}

	public static String[] comaSplitvalue(String comaValue) {

		String[] data = comaValue.split(",");
		for (String string : data) {

			System.out.println(string);
		}
		return data;
	}

//	public static void main(String args[]) {
////	intToabcd(1);  
////	intToabcd(4);  
////	intToabcd(10);  
////	intToabcd(31);  
//		comaSplitvalue("2,3,4,5");
//	}

}