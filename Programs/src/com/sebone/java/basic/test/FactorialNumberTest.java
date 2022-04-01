
package com.sebone.java.baisc.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.java.basic.FactorialNumber;

/**
 * @author Ritika Jaiswal
 *
 */
public class FactorialNumberTest {

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
	 * Test method for {@link com.sebone.java.basic.FactorialNumber#Factorialofgivennumber(int)}.
	 */
	@Test
	public void testFactorialofgivennumber() {
		FactorialNumber factNumber=new FactorialNumber();
		assertEquals(6, factNumber.factorialOfGivenNumber(3));
		//assertEquals(24), primeNumber.checkForPrime(4));
	}

}
