package com.xworkz.generalAptitude;

import java.util.Arrays;

public class Anagram {
	public boolean anagramCheck(char[] str1, char[] str2) {
		int n1 = str1.length;
		int n2= str2.length;
		
		if(n1!=n2)
			return false;
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0;i<n1;i++)
			if(str1[i]!=str2[i])
				return false;
		
		return true;
	}
	


	}


