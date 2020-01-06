package com.nt.pp;

import java.util.HashMap;
import java.util.Set;

public class RemoveDuplicates {
	
	
	static void dulicateCharacters(String str)
	
	{
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		char[] charArray=str.toCharArray();
		
		for(char c:charArray) {
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
				
			}
			else {
				map.put(c, 1);
			}
		}
		
		Set<Character> set=map.keySet();
		
		for(Character ch:set) {
			
			if(map.get(ch)>1) {
				System.out.println(ch+"-->count->"+map.get(ch));
				
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dulicateCharacters("javaj2eehello");
		
		

	}

}
