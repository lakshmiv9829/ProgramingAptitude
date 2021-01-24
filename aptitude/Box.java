package com.xworkz.aptitude;

public class Box {
	public static void main(String[] args) {
		
		int num=4;
		for(int i=0;i<=num;i++) {
			for(int j=0;j<=i;j++) {
				if(j==i||i+j==num) {
					System.out.print("*");
				}
				else if(i==0||j==0||j==num||i==num) {
				System.out.print("@");
				
			}
			else {
				System.out.print(";");
			}
			System.out.println();

}
}
		
	}

}
