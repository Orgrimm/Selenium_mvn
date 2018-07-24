package test;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterClass;

public class UnitTest {
	@BeforeClass
	public static void setup() {
		System.out.println("This is setup before class");
	}
	
	@AfterClass
	public static void tearDown() {
		System.out.println("This is tear down after class");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("This is before annotation");
	}
	@After
	public void afterTest() {
		System.out.println("This is after annotation");
	}
	
	@Test
	public void test1() {
		System.out.println("This is test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is test 2");
	}
}
