package com.sebone.java.collection;
import java.util.ArrayList;

public class SortingExecution {
	public UserData getUserData(int age, int rollNumber, String name) {
		UserData userData = new UserData();
		userData.setAge(age);
		userData.setName(name);
		userData.setRollNumber(rollNumber);
		return userData;
	}
	public static void main(String[] args) {
      SortingExecution sortingExecution = new SortingExecution();
      ArrayList<UserData> userDataList = new ArrayList<UserData>();
      userDataList.add(sortingExecution.getUserData(22, 101, "pari"));
      userDataList.add(sortingExecution.getUserData(21, 104, "ritika"));
      userDataList.add(sortingExecution.getUserData(20, 100, "paras"));
      userDataList.add(sortingExecution.getUserData(17, 105, "prakhar"));
      userDataList.add(sortingExecution.getUserData(23, 109, "vaishu"));
      userDataList.add(sortingExecution.getUserData(19, 107, "uttu"));
      System.out.println("original List");
      for(UserData user :userDataList) {
    	  System.out.println(user.getAge()+" "+user.getName()+" "+user.getRollNumber());
      }
      SortUserDataImplement sortUserDataImplement = new  SortUserDataImplement();
      ArrayList<UserData>sortedList = sortUserDataImplement.SortByAge(userDataList);
      System.out.println();
      System.out.println("Sorted by age");
      for(UserData user :userDataList) {
    	  System.out.println(user.getAge()+" "+user.getName()+" "+user.getRollNumber());
      }
      System.out.println();
       SortUserDataImplement sortUserDataImplement2 = new  SortUserDataImplement();
       ArrayList<UserData>sortedList2 = sortUserDataImplement.SortByRollNumber(userDataList); 
       System.out.println("Sorted by Rollnumber");
       for(UserData user2 :userDataList) {
          System.out.println(user2.getAge()+" "+user2.getName()+" "+user2.getRollNumber());
       }
       System.out.println();
       SortUserDataImplement sortUserDataImplement3 = new  SortUserDataImplement();
       ArrayList<UserData>sortedList3 = sortUserDataImplement.SortByName(userDataList);
       System.out.println("Sorted by Name");
       for(UserData user3 :userDataList) {
           System.out.println(user3.getAge()+" "+user3.getName()+" "+user3.getRollNumber());
      }
	}
} 

