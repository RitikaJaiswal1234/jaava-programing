package com.sebone.java.collection;
import java.util.ArrayList;
import java.util.Collections;
/**Class name :- SortUserDataImplement
 * Objective :- this class sorting the user data
 * @author Ritika Jaiswal
 * Data :- 21/03/22
 */
public class SortUserDataImplement implements SortUserData {
	 public ArrayList<UserData>SortByName(ArrayList<UserData>userData){
	     Collections.sort(userData,new SortByName());
		 return userData;
	 }
	 public ArrayList<UserData>SortByAge(ArrayList<UserData>userData){
		 Collections.sort(userData,new SortByAge());
		 return userData;
	 }
	 public ArrayList<UserData>SortByRollNumber(ArrayList<UserData>userData){
		 Collections.sort(userData,new SortByRollNumber());
		 return userData;
	 }
	@Override
	public ArrayList<UserData> SortbyRollNumber(ArrayList<UserData> userData) {
		// TODO Auto-generated method stub
		return null;
	}
}

	

