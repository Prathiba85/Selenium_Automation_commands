package testng;

import org.testng.annotations.Test;

public class secondfile {
	@Test(groups= {"High","Smoke"})
	public  void secondfile_display()
	{
		System.out.println("This is from second file ");
	}

}
