package testNGPackage;

import org.testng.annotations.Test;

public class TestNG12 {
	
		@Test(groups="it_department")  
		public void java()  
		{  
		System.out.println("I am a java developer");  
		}  
		@Test(groups="it_department")  
		public void dot_net()  
		{  
		System.out.println("I am a .Net developer");  
		}  
		@Test(groups="it_department")  
		public void tester()  
		{  
		System.out.println("I am a software tester");  
		}  
		@Test (groups="hr")  
		public void hr()  
		{  
			System.out.print("I am hr");  
		}  
		}


