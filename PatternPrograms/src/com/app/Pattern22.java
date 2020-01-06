package com.app;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=4;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(i+65));
			}
			System.out.println();
		}
	}
}

