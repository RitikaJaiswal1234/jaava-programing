package com.sebone.java.collection;

import java.util.Comparator;

public class SortByRollNumber  implements Comparator<UserData>{

	@Override
	public int compare(UserData userData1, UserData userData2) {
		return userData1.getRollNumber()-(userData2.getRollNumber());
	}

}
