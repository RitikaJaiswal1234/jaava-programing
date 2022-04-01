package com.sebone.java.collection;

import java.util.Comparator;
public class SortByName implements Comparator<UserData> {

	@Override
	public int compare(UserData userData1 , UserData userData2) {
		return userData1.getName().compareTo(userData2.getName());
	}
 }
