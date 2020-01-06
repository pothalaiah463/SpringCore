package com.nt.pp;

import java.util.Scanner;

public class PalindromeNumber {
	 static int r=0,sum=0;

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		int num=sc.nextInt();
		int temp=num;
		
		while(num>0) {
			
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
		}
		if(temp==sum) {
			System.out.println("It is a palindrome");
			
		}
		else {
			System.out.println("Not a palindrome");
		}
		
		
	}

}
