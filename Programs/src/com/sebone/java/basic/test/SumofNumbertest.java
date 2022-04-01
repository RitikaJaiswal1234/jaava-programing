/**
 * 
 */
package com.sebone.java.baisc.test;

import static org.junit.Assert.*;
import com.sebone.java.basic.SumofNumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Ritika Jaiswal
 *
 */
public class SumofNumbertest {

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
		SumofNumber sumnumber=new SumofNumber();
		assertEquals(10,sumnumber.sumofdigit(4));
		assertEquals(6,sumnumber.sumofdigit(3));
		assertEquals(15,sumnumber.sumofdigit(5));
	}

}
