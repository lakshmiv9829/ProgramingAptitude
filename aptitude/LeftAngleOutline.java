package com.xworkz.aptitude;

public class LeftAngleOutline {
	public static void main(String[] args) {
		int num=4;
		for(int i=0;i<=num;i++)
		for(int j=0;j<=i;j++) {
			if(j==num||i==num||i+j==num) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
		System.out.println();

}

	}


