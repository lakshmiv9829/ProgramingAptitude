package com.xworkz.alphabets;

public class YLetter {

	public static void main(String[] args) {
		int num=7;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
	 if((i==j&&i!=num-1&&i!=num-2&&i!=num-3)||i+j==num-1)		
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
