package com.xworkz.alphabets;

public class ELetter {

	public static void main(String[] args) {
		int num=5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
	 if(j==0||i==0||i==num-1||i==num/2)			
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
