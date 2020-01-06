package com.nt.pp;

import java.util.Scanner;

public class ArmstrongNumber {
	static int sum=0,r=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		int num=sc.nextInt();
		int temp=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			sum=sum+(r*r*r);
		}
		
		if(temp==sum) {
			
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not a Armstrong number");
		}

	}

}
