package testNGPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG4 {
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("this is before suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("this is before test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("this is before class");
	}
	@Test
	public void c1_Test(){
		System.out.println("Inside c1_ method");
	}
	@Test
	public void c3_Test(){
		System.out.println("inside c3_test method");
	}
	@Test
	public void c2_test()
	{
		System.out.println("inside c2_test method");
	}
	@Test
	public void zest(){
		System.out.println("inside zest");
	}
	@Test
	public void zess()
	{
		System.out.println("inside zess");
	}
	
}
