package com.sebone.java.map;

import java.util.HashMap;
import java.util.List;

public interface UserDataMapHandler {
	  HashMap<Integer, UserData> getUserDataMap();
      HashMap<String, List<UserData>> findUserDataMapByName();
      
      List<UserData> findUserDataListByName(String name);
      
      HashMap<String, List<UserData>> updateUserAgeByName(String name, int age);
      
}
