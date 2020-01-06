package com.nt.pp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertHashMaptoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String, String> map=new HashMap<String,String>();
		map.put("virat", "anushka");
		map.put("rohit","rithika");
		map.put("msdhoni", "padya");
		System.out.println("Map objects:"+map);
		
		System.out.println("-------------------------------");
		
		
		Set<Entry<String, String>> convertSet=map.entrySet();
		
		ArrayList<Entry<String, String>> listConvert=new ArrayList<>(convertSet);
		
		System.out.println("ArrayList key-value pairs");
		
		for(Entry<String, String> list:listConvert) {
			System.out.println(list.getKey()+"--->"+list.getValue());
		}
		
		
	}

}
