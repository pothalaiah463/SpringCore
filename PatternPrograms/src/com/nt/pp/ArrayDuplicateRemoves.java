package com.nt.pp;

import java.util.HashSet;

public class ArrayDuplicateRemoves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] duplicates= {1,2,3,2,1,5,1,9,3,2,7};
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int i=0;i<duplicates.length;i++) {
			int count=0;
			if(set.add(duplicates[i])==false) {
				count++;
				System.out.println("Duplicate Elements Found:"+duplicates[i]+"-->"+count);
			}
		}

	}

}
