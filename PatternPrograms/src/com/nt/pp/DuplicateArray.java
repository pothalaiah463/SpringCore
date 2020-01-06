package com.nt.pp;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array= {1,2,3,4,5,6,1,2,3,7,8,9};
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]==(array[j])&&(i!=j)) {
					System.out.println("Duplicate Elements are:"+array[i]+"-->"+i);
					
				}
			}
		}

	}

}
