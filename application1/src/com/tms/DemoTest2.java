package com.tms;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DemoTest2 {
	static Demo d;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		d = new Demo();

	}

//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}

	@BeforeEach
	void setUp() throws Exception {

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void sumtest() {
		int iv = d.sum(4, 5);
		int ev = 9;
		assertEquals(iv, ev);
	}

	@Test
	public void divtest() {
		assertNotEquals(3, d.div(4, 2));

	}

}
