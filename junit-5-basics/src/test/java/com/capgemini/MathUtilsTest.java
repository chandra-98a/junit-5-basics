package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathUtils=new MathUtils();
		int expected=2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected,actual,"The add method should add two numbers");	
}
	@Test
	void testDivide() {
		MathUtils mathUtils=new MathUtils();
		assertThrows(NullPointerException.class,()-> mathUtils.div(1, 0),"divide by zero should throw");
		
	}
	
	@Test
	void testComputeCircleArea() {
		MathUtils mathUtils=new MathUtils();
		assertEquals(314.00,mathUtils.computeCircleArea(10),"should return the circle area");
	}
}
