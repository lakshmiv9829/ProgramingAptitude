package com.xworkz.generalAptitude;

public class AramstrongNumber {

	public static void main(String[] args) {
		int num = 0, a, temp;
		int n = 153;
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			num = num + (a * a * a);
		}
		if (temp == num)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");
	}

}
