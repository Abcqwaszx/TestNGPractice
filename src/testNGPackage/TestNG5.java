package testNGPackage;

import org.testng.annotations.Test;

public class TestNG5 {
	//second
	@Test(priority=-10)
	public void a(){
		System.out.println("Inside a method");
	}
	//it will run first
	@Test(priority=-20)
	public void b(){
		System.out.println("insideb method");
	}
	//run at 5
	@Test(priority=0)
	public void z()
	{
		System.out.println("this is z");
	}
	@Test(priority=2)
	public void d(){
		System.out.println("this is d");
	}
	//run in 3rd
	@Test
	public void e()
	{
		System.out.println("this is e");
	}
	
	@Test//run at 4 
	public void s()
	{
		System.out.println("this is s");
	}
	
	@Test(priority=1)
	public void f()
	{
		System.out.println("this is f");
	}
}
