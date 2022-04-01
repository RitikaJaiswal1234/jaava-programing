package com.sebone.java.collection;

import java.util.Comparator;

public class SortByAge implements Comparator<UserData>{

	@Override
	public int compare(UserData userData1, UserData userData2) {
		return userData1.getAge()-(userData2.getAge());
	}
}
