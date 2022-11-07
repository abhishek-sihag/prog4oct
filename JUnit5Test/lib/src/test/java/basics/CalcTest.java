package basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalcTest {
	Calc cal =new Calc();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp()");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown()");
		cal=null;
	}
	
	@Test
	@Disabled
	void addTest1() {
		int result= cal.add(10, 20);
		assertEquals(30, result);
	}
	
	@Test
	void addTest() {
		cal.add(10, 20);
	}
	
	@Test
	void subTest() {
		cal.sub(10, 20);
	}

//	@Test
//	void test1() {
//		System.out.println("test1()");
//		fail("Not yet implemented");
//	}
//	@Test
//	void test2() {
//		System.out.println("test2()");
//		fail("Not yet implemented");
//	}
//	@Test
//	void test3() {
//		System.out.println("test3()");
//		fail("Not yet implemented");
//	}

}
