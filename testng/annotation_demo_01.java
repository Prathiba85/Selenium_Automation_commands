package testng;

import org.testng.annotations.*;


public class annotation_demo_01 {
	@BeforeClass
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
	@AfterClass
	void logout()
	{
		System.out.println("Logout");
	}
}
