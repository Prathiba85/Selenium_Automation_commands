package Selenium_commands;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit_multipletestcase_before_Afte_class {

	//Before and after will execute before each test case
	@BeforeClass
	public static  void startbrowser()
	{

		WebDriverManager.chromedriver().setup();
		System.out.println("Before class testcase");
	}
	@Before
	public   void before()
	{

		WebDriverManager.chromedriver().setup();
		System.out.println("Before  testcase");
	}
	
	@Test //Annotation
	public void TC001 ()
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver c = new ChromeDriver(options);
	
	
		//c.wait(10000);
		c.get("http://www.google.com");
		c.close();
		System.out.println("Testcase1 complete");
		
	
	}
	@After
	public   void after()
	{

		WebDriverManager.chromedriver().setup();
		System.out.println("after testcase");
	}
	
	@Test
	
	public  void Tc002()
	{
		EdgeDriver cr = new EdgeDriver();
		cr.get("http://www.google.com");
		cr.close();
		System.out.println("Testcase2 complete");
		
	
	}
	@Test
	@Ignore
	public  void Tc003()
	{
		EdgeDriver cr = new EdgeDriver();
		cr.get("http://www.google.com");
		cr.close();
		System.out.println("Testcase2 complete");
		
	
	}
	@AfterClass
	public static void closebrowser()
	{

		System.out.println("After class testcase");
	}
}
