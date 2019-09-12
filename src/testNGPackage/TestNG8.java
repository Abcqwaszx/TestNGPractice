package testNGPackage;

import org.testng.annotations.Test;

public class TestNG8 {
@Test
public void a(){
	System.out.println("this is a method");
}

//@Test
public void b(){
	System.out.println("this is b method");
	
}
//to skip the test 
@Test(enabled=false)
public void c(){
	System.out.println("this is c method");
	
}
@Test
public void d(){
	System.out.println("this is d method");
	
}
}
