package com.saha.jenkinsApp;

import static org.junit.Assert.*;

import static org.junit.Assert.*;
//import java.lang.reflect.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleTest {

	/**
	 * @throws java.lang.Exception
	 */

	Sample s = null;

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
		s = new Sample();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.saha.junit.Sample#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		assertEquals(6, s.add(4, 2));
		// fail("Not yet implemented");
	}

	@Test
	public void testStaticAdd() {
		assertEquals(6, Sample.staticAdd(4, 2));
		assertEquals(6, s.staticAdd(4, 2));
	}

	@Test
	public void testPublicAdd() {
		assertEquals(6, s.publicAdd(4, 2));
		// fail("Not yet implemented");
	}

}
