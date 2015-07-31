package com.sky;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaxpersonTest {

	@Test
	public void testTaxCalc() {
		
		assertTrue(Taxperson.getCost(100, false) == 101);
		assertTrue(Taxperson.getCost(100, true) == 109);
		
		assertTrue(Taxperson.getCost(50, false) == 51);
		assertTrue(Taxperson.getCost(50, true) == 55);
	}

}
