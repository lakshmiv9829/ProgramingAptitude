package com.xworkz.alphabets;

public class SLetter {

	public static void main(String[] args) {
		int num=5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
	 if((i==0&&j!=0)||(i==num/2&&j!=num-1)||(i==1&&j==0)||(i==num-1&&j!=num-1)||i+j==7)			
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
