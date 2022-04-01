package com.sebone.java.map;

import java.util.*;

public class BasicFunction {
  public static void main(String[] args) {
   Map<Integer,String> map=new HashMap<Integer,String>();  
   map.put(100,"Mayuri");  
   map.put(101,"Ritika");  
   map.put(102,"Muskan"); 
   map.put(103,"Himanshu");
    
   for(Map.Entry data:map.entrySet()){  
    System.out.println(data.getKey()+" "+data.getValue());  
   }  
}
}