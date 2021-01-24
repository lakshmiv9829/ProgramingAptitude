
package com.xworkz.aptitude;

public class BothUpperLowerTriangle {
	public static void main(String[] args) {
		int num = 4;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if ((j >= i && i + j <= num) || (i + j >= num && j <= i)) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();

		}
	}

}
