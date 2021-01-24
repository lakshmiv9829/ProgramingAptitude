package com.xworkz.alphabets;

public class JLetter {

	public static void main(String[] args) {
		int num=5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
	 if(i==0||j==num/2||(j==0&&i!=0&&i!=1&&i!=2)||(i==num-1&&j==1))			
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
