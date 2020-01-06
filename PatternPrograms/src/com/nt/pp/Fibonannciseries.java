package com.nt.pp;

import java.util.Scanner;

public class Fibonannciseries {
	static int n1=0,n2=1,n3=0;
	
	static void fibonannci(int num)
	{
		if(num>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println("fibonnanci number is:"+n3);
			fibonannci(num-1);
			
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		int a=sc.nextInt();
		
		System.out.println(n1+"--And number is:"+n2);
		fibonannci(a-2);

	}

}
