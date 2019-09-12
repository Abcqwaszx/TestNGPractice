package testNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG9 {

	WebDriver driver;
	@BeforeMethod
	
	public void preCondition(){
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@Test
	public void openFacebookurl() throws Exception{
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	}
	@Test(dependsOnMethods ="openFacebookurl")
	public void enterUsername()
	{
		
	}
  

}	
 

