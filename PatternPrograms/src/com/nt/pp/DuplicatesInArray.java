package com.nt.pp;

public class DuplicatesInArray {
	
	//1.BruteForce method
	
	public static void findDuplicaesArray(int[] inputArray) {
		
		for(int i=1;i<inputArray.length;i++) {
			for(int j=i+1;j<inputArray.length;j++) {
				 if(inputArray&#91;i&#93; == inputArray&#91;j&#93;)
	                {
	                    System.out.println("Duplicate Element : "+inputArray&#91;i&#93;);
	                }
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inputArray= new int[]{895,25,895,1,3,1,995,54,3};
		System.out.println("BruteForce method using duplicates:"+inputArray);

	}

}
