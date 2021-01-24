package com.xworkz.stringExecution;

public class ReverseString {
	public static String reverseString(String str) {
		char name[] = str.toCharArray();
		String rev = "";
		for (int i = name.length - 1; i >= 0; i--) {
			rev = rev + name[i];
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(reverseString("hii good afternoon"));

	}
}