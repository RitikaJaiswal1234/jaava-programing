package com.sebone.java.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapProgram3 {
	public UserData getUserData(int rollNumber ,String name , int age) {
		UserData userData = new UserData();
		userData.setAge(age);
		userData.setName(name);
		userData.setRollNumber(rollNumber);
		return userData;
	}
	public Map<String, ArrayList<UserData>> getValueByName(ArrayList<UserData>userDataList) {
		  Map<String,  ArrayList<UserData>> map=new HashMap<String,ArrayList<UserData>>();
		  for(UserData userData:userDataList) {
			if(map.get(userData.getName())!=null) {
			    map.get(userData.getName()).add(userData);
			}else {
				ArrayList<UserData> mapUserData=new ArrayList<UserData>();
				mapUserData.add(userData);
				map.put(userData.getName(),mapUserData);
			}
		 }
		 return map;
	}
	public static void main(String[] args) {
		  MapProgram3 mapProgram3 = new MapProgram3();
		  ArrayList<UserData> userDataList=new ArrayList<UserData>();
		  userDataList.add(mapProgram3.getUserData(102,"Ram", 22));
		  userDataList.add(mapProgram3.getUserData(101,"Ram", 24));
		  userDataList.add(mapProgram3.getUserData(104,"Nish", 23));
		  userDataList.add(mapProgram3.getUserData(104,"Ram", 23));
			 
		  Map<String, ArrayList<UserData>>  resultMap=mapProgram3.getValueByName(userDataList);
		  Set<String> keys=resultMap.keySet();
		  System.out.println("Original data ");
		  for(String key:keys) {
			  for(UserData userData:resultMap.get(key)) {
				  System.out.println(userData.getRollNumber()+" "+userData.getAge()+" "+userData.getName());
			  }
			 
			  //System.out.println("key "+ key +" values "+resultMap.get(key));
		  }
		  
		  List<UserData> userDataListNew = resultMap.get("Ram");
		  for(UserData data : userDataListNew) {
			  data.setAge(20);
		  }
		  System.out.println("Change data ");
			
		  for(String key:keys) {
			  for(UserData userData:resultMap.get(key)) {
				 System.out.println(userData.getRollNumber()+" "+userData.getAge()+" "+userData.getName());
			  }
		  }
		  
	}

}
