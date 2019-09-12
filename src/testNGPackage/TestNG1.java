package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG1 {
  @Test
  public void AssertionCheck() {
	  String ExpectedMessage="Form Submitted Successfully.";
	  String ActualMessage="Form Submitted Successf.";
	  
	  Assert.assertEquals(ActualMessage, ExpectedMessage);
  }
}
