package com.nt.pp;

import java.util.Arrays;

public class AnangramCheck {
	
	static void isAnangram(String s1,String s2) 
	{
		
		String copy1=s1.replaceAll("\\s1", " ");
		String copy2=s2.replaceAll("\\s2", " ");
		
		boolean status=true;
		
		if(copy1.length()!=copy2.length()) {
			
			status=false;
		}
		else {
			char[] ch1=copy1.toCharArray();
			char[] ch2=copy2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			status=Arrays.equals(ch1, ch2);
		}
		if(status) {
			System.out.println("Two Strings are Annagram");
		}
		else {
			System.out.println("Not Ananagrams");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isAnangram("sct","tcs");
		isAnangram("cat","rat");

	}

}
