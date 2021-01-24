package com.xworkz.aptitude;

public class RightAngleOutline {
	public static void main(String[] args) {
		 int num=4;
			for(int i=0;i<=num;i++) {
				for(int j=0;j<=i;j++) {
					if(j==i||i==num||j==0) {
						System.out.print("*");
					}
					System.out.print(" ");
				}
				System.out.println();

}
	}
}
