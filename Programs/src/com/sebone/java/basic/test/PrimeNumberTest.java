/**
 * 
 */
package com.sebone.java.baisc.test;

import static org.junit.Assert.*;

import com.sebone.java.basic.PrimeNumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Ritika Jaiswal
 *
 */
public class PrimeNumberTest {

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

	/**
	 * Test method for {@link com.sebone.java.basic.PrimeNumber#checkForPrime(int)}.
	 */
	@Test
	public void testCheckForPrime() {
		PrimeNumber primeNumber = new PrimeNumber();
		assertEquals(true, primeNumber.checkForPrime(3));
		assertEquals(false, primeNumber.checkForPrime(4));
	}

}
