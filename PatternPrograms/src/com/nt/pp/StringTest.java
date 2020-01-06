package com.nt.pp;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="ABCDEFGH";
		
		for(int i=1;i<=str.length();i++) 
		{
			
			for(int j=1;j<=str.length();i++) {
				if((i%j)==0) {
					System.out.println(str.charAt(i));
				}
				else {
					System.out.println(j+"");
				}
			}
			
			
		}
		

	}

}
