package testng;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Assertionclass {
@Test(groups= {"High","Smoke"})
public void validate_field()
{
	System.out.println("TC004");
	//Assert.assertEquals(true, false);
	Assert.assertEquals("Hello","text","This step will fail if actual and expected didn't match");
	
}
}
