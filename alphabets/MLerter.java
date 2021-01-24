package com.xworkz.alphabets;

public class MLerter {

	public static void main(String[] args) {
		int num=5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
	 if(j==0||j==num-1||(i==j&&j!=3&&j!=4)||(i==1&&j==3))			
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
