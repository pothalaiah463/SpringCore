package com.nt.pp;

import java.util.Scanner;

public class FactorialNumber {
	
	static int factorial(int num)
	{
		if(num==0) {
			return 1;
		}else {
			
			return(num*factorial(num-1));
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		int a=sc.nextInt();
		
		int fact=1;
		fact=factorial(a);
		
		System.out.println("Factorial number-->"+a+"is--->"+fact);
		
		

	}

}
