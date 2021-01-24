package com.xworkz.alphabets;

public class TLetter {

	public static void main(String[] args) {
		int num=7;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
	 if(i==0||j==num/2)			
			{
					System.out.print("*");
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();
		}
	}

}
