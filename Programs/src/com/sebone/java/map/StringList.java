package com.sebone.java.map;

import java.util.*;

public class StringList {
	public static void main(String[] args) {
   HashMap<Integer,String>map = new HashMap<Integer,String>();
  map.put(10,"pari");
  map.put(21,"ritka");
  map.put(23,"prakhar");
  map.put(13,"prakhar");
  Set<Integer> keys =  map.keySet();
  for(Integer x:keys)
	  System.out.println(" "+x+" values "+map.get(x));
}
}




