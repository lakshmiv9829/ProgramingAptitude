package com.xworkz.generalAptitude;

import java.util.Scanner;

public class PalindromeOrNot {
	Scanner scanner = new Scanner(System.in);
	public static int palindrome(int num) {
		int r, temp;
		int sum = 0;
		temp = num;
		while (num != 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("palindrome");
		} else {
			System.out.println(" not a palindrome");
		}
		return sum;
	}
	public static void main(String[] args) {
		int num, s;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the num");
		num = scanner.nextInt();
		s = PalindromeOrNot.palindrome(num);

	}

}
