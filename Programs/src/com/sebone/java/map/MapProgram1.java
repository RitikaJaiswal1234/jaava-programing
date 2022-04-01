package com.sebone.java.map;
import java.util.*;
public class MapProgram1 {
	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(11,"Nishchal");
		map.put(12,"ritika");
		map.put(13,"vaishu");
		map.put(14,"ritika");
		// for(Map.Entry data:map.entrySet()){  
		//	   System.out.println(data.getKey()+" "+data.getValue()); 
			   Set<Integer> keys = map.keySet();
				  for(Integer x: keys) {
					  System.out.println(""+x+" values " + map.get(x));
	  } 
		
	}
}
