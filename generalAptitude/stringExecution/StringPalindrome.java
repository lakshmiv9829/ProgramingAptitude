package com.xworkz.stringExecution;

public class StringPalindrome {
	public static boolean isPalndrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "lakshmi";
		System.out.println(str.charAt(5));
		if (isPalndrome(str))
			System.out.println("it is palindrome");
		else {
			System.out.println("its not a palindrome");
		}
	}

}
