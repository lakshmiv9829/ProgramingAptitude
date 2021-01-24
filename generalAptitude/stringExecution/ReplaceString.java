package com.xworkz.stringExecution;

public class ReplaceString {
	
	public static String replaceName(String str,String name) {
		System.out.println(str);
		String str2=str.replace("name", name);
		return str2;
	}


	public static void main(String[] args) {
		String str3=replaceName("hi name welcome to string execution","lakshmi");
		System.out.println(str3);
		
		
}
}