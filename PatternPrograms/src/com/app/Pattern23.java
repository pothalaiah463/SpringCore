package com.app;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=4;i++) {
			
			for(int j=4;j>=i;j--) {
				System.out.print((char)(j+65));
			}
			System.out.println();
		}

	}

}
