package com.nt.pp;

public class TwoArraysareEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a1= {2,5,7,1,4};
		
		int[] a2= {2,5,7,1,4};
		boolean eqnt=true;
		
		
		if(a1.length==a2.length) {
			for(int i=0;i<a1.length;i++) {
				if(a1[i]!=a2[i]) {
					eqnt=false;
					
				}
				else {
					eqnt=false;
				}
			}
		}
				if(eqnt) {
					System.out.println("Two arrays are equal");
				}
				else {
					System.out.println("Two arrays are not euql");
				}
			}
		
		
		

	}


