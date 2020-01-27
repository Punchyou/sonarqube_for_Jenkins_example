package com.engineer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {

	Calculation obj = new Calculation();
	
	@Test
	public void twoPlusTwoEqualsFour() {
		assertEquals(2, obj.adder(1, 1));
		
	}
}

