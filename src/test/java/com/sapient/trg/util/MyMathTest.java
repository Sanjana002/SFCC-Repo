package com.sapient.trg.util;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {

	//	private MyMath mm = null;
	//	@BeforeAll
	//	static void setUpBeforeClass() throws Exception {
	//	}
	//
	//	@AfterAll
	//	static void tearDownAfterClass() throws Exception {
	//	}

	//	@BeforeEach
	//	void setUp() throws Exception {
	//		mm = new MyMath();
	//	}
	//
	//	@AfterEach
	//	void tearDown() throws Exception {
	//		mm = null;
	//	}

	@Test
	void testisperfect() {
		assertEquals(true, MyMath.isperfect(6));
	}

	@Test
	void testisperfectForFailure() {
		assertNotEquals(true,MyMath.isperfect(5));
	}

	@Test
	void testisPrime() {
		assertEquals(false, MyMath.isPrime(6));
	}

	@Test
	void testisPrimeForFailure() {
		assertNotEquals(false,MyMath.isPrime(2));
	}

	@Test
	void testisArmstrong() {
		assertEquals(true, MyMath.isArmstrongNumber(1634));
	}

	@Test
	void testisArmstrongForFailure() {
		assertNotEquals(false,MyMath.isArmstrongNumber(1634));
	}

	@Test
	void testisPalindrome() {
		assertEquals(true,MyMath.isPalindrome(66));
	}

	@Test
	void testisPalindromForFailure() {
		assertNotEquals(true,MyMath.isPalindrome(166));
	}

	@Test
	void testBtoD() {
		assertEquals(10,MyMath.binaryToDecimal(1010));
	}

	@Test
	void testBtoDForFailure() {
		assertNotEquals(10,MyMath.binaryToDecimal(1011));
	}

}
