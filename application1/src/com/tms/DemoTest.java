package com.tms;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

	@Test
	public void sumtest() {
		Demo d = new Demo();
		int iv = d.sum(4, 5);
		int ev = 9;
		assertEquals(iv, ev);
	}

	@Test
	public void divtest() {
		Demo d = new Demo();
		assertEquals( 2, d.div(4, 2));
		
	}

}
