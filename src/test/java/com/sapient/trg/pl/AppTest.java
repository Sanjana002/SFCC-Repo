package com.sapient.trg.pl;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * 
 * @author sangupta27
 * short-cut keys: ctrl / : block comment
 *
 */
class AppTest {
	private App app = null;
//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//		System.out.println("Before all test methods");
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//		System.out.println("After all test methods");
//	}

	@BeforeEach
	void setUp() throws Exception {
		app=new App();
		//System.out.println("Before each test methods");
	}

	@AfterEach
	void tearDown() throws Exception {
		//System.out.println("After each test methods");
		app=null;
	}

	@Test
	void testSquare() {
//		System.out.println("test method: square()");
//		fail("Not yet implemented");
		
		assertEquals(25, app.square(5));
	}
	
	@Test
	void testSquareForFailure() {
		assertNotEquals(20,app.square(5));
	}
	@Test
	void testCube() {
//		System.out.println("test method: cube()");
//		fail("Not yet implemented");
		
		assertEquals(125, App.cube(5));
	}
	
	@Test
	void testCubeForFailure() {
		assertNotEquals(20,App.cube(5));
	}

}
