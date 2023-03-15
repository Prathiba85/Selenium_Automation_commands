package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit_multipletestcase {

	//Before and after will execute before each test case
	@Before
	public void startbrowser()
	{

		WebDriverManager.chromedriver().setup();
		System.out.println("Before testcase");
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
		
	
	}
	@Test
	public void Tc002()
	{
		EdgeDriver cr = new EdgeDriver();
		cr.get("http://www.google.com");
		cr.close();
		
	
	}
	@After
	public void closebrowser()
	{

		System.out.println("After testcase");
	}
}
