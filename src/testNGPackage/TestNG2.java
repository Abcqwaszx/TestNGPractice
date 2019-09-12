package testNGPackage;

import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test
	public void b(){
		System.out.println("This is b method");
	}
@Test
public void a(){
	//program will execute first then it will generate report
	//first this will  execute as it run in alphabetical order
	System.out.println("This is a method  okay");
}

}

