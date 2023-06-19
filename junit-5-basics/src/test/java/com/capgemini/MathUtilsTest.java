package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class MathUtilsTest {
	
	MathUtils mathUtils;
	
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("Welcome");
	}
	
	@BeforeEach
	void init() {
		 mathUtils=new MathUtils();
	}

	@AfterEach
	void cleanUp() {
		System.out.println("cleaning up......");
	}
	@Test
	void testAdd() {
		
		int expected=2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected,actual,"The add method should add two numbers");	
}
	@Test
	void testDivide() {
		
		assertThrows(ArithmeticException.class,()-> mathUtils.div(1, 0),"divide by zero should throw");
		
	
	}
	
	@Test
	void testComputeCircleArea() {
		
		assertEquals(314.00,mathUtils.computeCircleArea(10),"should return the circle area");
	}
	
	@Test
	void testSub() {
		
		int expected=1;
		int actual=mathUtils.sub(2, 1);
		assertEquals(expected,actual,"The subtract method should give 1 as an output");
	}
	
	
	@AfterAll
	static void afterAllMethod() {
		System.out.println("Good bye..");
	}
}
