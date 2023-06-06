package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class MathUtilsTest {

	@Test
	void test() {
		MathUtils mathUtils=new MathUtils();
		int expected=2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected,actual,"The add method should add two numbers");	

}
	
	@Test
	void testComputeCircleArea() {
		MathUtils mathUtils=new MathUtils();
		assertEquals(314.00,mathUtils.computeCircleArea(10),"should return the circle area");
	}
}
