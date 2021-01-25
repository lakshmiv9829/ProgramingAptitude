package com.xworkz.generalAptitude;

public class AnagramTester {

	public static void main(String[] args) {
		char str1[]= {'x','w','o','r','k','z'};
		char str2[]= {'w','o','x','r','z','k'};
		Anagram anagram=new Anagram();
		if(anagram.anagramCheck(str1, str2))
			System.out.println("Anagram");
		else
			System.out.println("not a Anagram");
		
	}

}
