package com.nt.pp;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=5,num2=6;
		
		System.out.println(num1+" before swapping And"+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println(num1+" After swapping And"+num2);

	}

}
