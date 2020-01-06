package com.nt.pp;

import java.util.Scanner;

public class PrimeNumber {
	static int flag=0;

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Number");
		int num=sc.nextInt();
		
		int m=num/2;
		
		if(num==0 || num==1) {
			System.out.println(num+"is not a prime");
		}
		else {
			for(int i=2;i<=m;i++) {
				if(num%i==0) {
					System.out.println(num+"is not a prime");
					flag=1;
					break;
					
					
				}
				else {
					if(flag==0) {
						System.out.println(num+"is a prime number");
					}
					
				}
			}
		}
		
		
	}

}
