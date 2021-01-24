package com.xworkz.aptitude;

public class UpperTringle {
	public static void main(String[] args) {
		int num=4;
		for(int i=1;i<=num-1;i++) {
			for(int j=num-1;j>=1;j--) {
				if(j>i) {
					System.out.print(" ");
				}
				else {
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}

}
