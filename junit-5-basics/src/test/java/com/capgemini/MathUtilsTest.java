package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
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
	@DisplayName("multiply method")
	
	void testmul() {
		//assertEquals(4,mathUtils.mul(2, 2),"Should return 4");
		assertAll(
				()-> assertEquals(4,mathUtils.mul(2, 2)),
				()-> assertEquals(8,mathUtils.mul(2, 4)),
				() -> assertEquals(10,mathUtils.mul(2, 5))
				);
		
	}
	
	
	
	@Nested
	@DisplayName("Addition" )
	class addTest{
		@Test
		void testAddPositive() {
			
			int expected=2;
			int actual = mathUtils.add(1, 1);
			assertEquals(expected,actual,"The add method should add two positive numbers");	
	}
		
		@Test
		void testAddNegative() {
			assertEquals(1,mathUtils.sub(-1, -2),"should ass two negative numbers");
		}
	}
	
	@Test
	//@EnabledOnOs(OS.LINUX)
	
	void testDivide() {
		boolean isServerUp=false;
		
		assumeTrue(isServerUp);
		assertThrows(ArithmeticException.class,()-> mathUtils.div(1, 0),"divide by zero should throw");
		
	
	}
	
	@Test
@DisplayName("AOC")
	void testComputeCircleArea() {
		assertEquals(314.00,mathUtils.computeCircleArea(10),"should return the circle area");
	}
	
	@Test 
	@Disabled
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
