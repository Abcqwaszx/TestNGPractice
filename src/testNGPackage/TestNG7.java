package testNGPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG7 {



	@Test
	public void a(){
		System.out.println("this is a method ");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this is before method ");
	}
	
	@Test(invocationCount=3,priority=-1)
	public void b()
	{
		System.out.println("this is b method ");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this is after method");
	}
}
