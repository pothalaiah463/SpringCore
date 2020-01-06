package com.nt.pp;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num+"Even number");
		}
		else {
			System.out.println(num+"-->Odd number");
		}
		
		

	}

}
