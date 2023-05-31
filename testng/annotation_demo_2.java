package testng;

import org.testng.annotations.*;


public class annotation_demo_2 {
	@BeforeMethod
	void login()
	{
		System.out.println("Login method execution");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("Search test execution");
	}
	@Test(priority=2)
	void advancedsearch()
	{
		System.out.println("Advanced Search");
	}
	@AfterMethod
	void logout()
	{
		System.out.println("Logout");
	}
}
