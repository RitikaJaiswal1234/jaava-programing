/**
 * 
 */
package com.sebone.java.collection.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.java.collection.UserData;

/**
 * @author Ritika Jaiswal
 *
 */
public class SortingExecutiontest {

	private static Object userData1;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		SortingExecutiontest sortingExecutiontest = new SortingExecutiontest();
		UserData userData1 = new UserData();
		userData1.setRollNumber(101);
		userData1.setAge(22);
		userData1.setName("pari");
		
		UserData userData2 = new UserData();
		userData2.setRollNumber(104);
		userData2.setAge(21);
		userData2.setName("ritika");
		
		UserData userData3 = new UserData();
		userData3.setRollNumber(105);
		userData3.setAge(17);
		userData3.setName("prakhar");
		
		UserData userData4 = new UserData();
		userData4.setRollNumber(107);
		userData4.setAge(19);
		userData4.setName("uttu");
		
		UserData userData5= new UserData();
		userData5.setRollNumber(109);
		userData5.setAge(23);
		userData5.setName("vaishu");
		ArrayList<UserData> userDataTest = new ArrayList<UserData>();
		userDataTest.add(userData1);
		userDataTest.add(userData2);
		userDataTest.add(userData3);
		userDataTest.add(userData4);
		userDataTest.add(userData5);
				
		ArrayList<UserData> userDataTest2 = new ArrayList<UserData>();
		userDataTest2.add(userData3);
		userDataTest2.add(userData4);
		userDataTest2.add(userData2);
		userDataTest2.add(userData1);
		userDataTest2.add(userData5);
		assertequals(userDataTest2, SortingExecutiontest.userData1);
	}

	private void assertequals(ArrayList<UserData> userDataTest2, Object userData1) {
		
	}
}
