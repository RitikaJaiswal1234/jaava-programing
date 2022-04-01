/**
 * 
 */
package com.sebone.java.baisc.test;

import static org.junit.Assert.*;
import com.sebone.java.basic.CountDigit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.sebone.java.basic.PrimeNumber;
/**
 * @author Ritika Jaiswal
 *
 */
public class CountDigitTest {

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
		CountDigit count=new CountDigit();
		assertEquals(3,count.countofDigit(123));
		assertEquals(5,count.countofDigit(33456));
		
	}

}
