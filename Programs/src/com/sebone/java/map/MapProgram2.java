package com.sebone.java.map;

import java.util.*;

public class MapProgram2 {
	public UserData getUserData(int rollNumber ,String name , int age) {
		UserData userData = new UserData();
		userData.setAge(age);
		userData.setName(name);
		userData.setRollNumber(rollNumber);
		return userData;
	}
	public static void main(String[] args) {
	  Map<Integer, UserData> map=new HashMap<Integer,UserData>();
	  MapProgram2 mapProgram2 = new MapProgram2();
	  map.put(101,mapProgram2.getUserData(101,"Ram", 21));  
	  map.put(102,mapProgram2.getUserData(102,"Ritika", 22));  
	  map.put(103,mapProgram2.getUserData(103,"Ravi", 23));  
	  Set<Integer> keys = map.keySet();
	  for(Integer x: keys) {
		  System.out.println(""+x+" values " + map.get(x));//calling toString method to return state of object
		  /*
		  System.out.println(""+x+" values " +  map.get(x).getRollNumber()+" " +map.get(x).getName()+" " +map.get(x).getAge());
		  */
	  }
	}
}
