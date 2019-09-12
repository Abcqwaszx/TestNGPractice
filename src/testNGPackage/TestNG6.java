package testNGPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG6 {
@Test
public void a(){
	System.out.println("this is  a method");
}
@BeforeMethod  
public void precondition()
{
	System.out.println("this is Before Method");
	}

@Test
public void b()
{
System.out.println("this is b method ");	
}
@AfterMethod
public void postCondition()
{
System.out.println("this is after method");	
}
}
