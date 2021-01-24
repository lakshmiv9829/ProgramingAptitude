package com.xworkz.stringExecution;

public class CharacterToString {
	public static void main(String[] args) {
		char[] str = value("hii");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	private static char[] value(String name) {
		char[] convertedName = name.toCharArray();
		return convertedName;
	}

}
