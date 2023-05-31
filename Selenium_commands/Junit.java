package Selenium_commands;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {

	@Before
	public void startbrowser()
	{

		WebDriverManager.chromedriver().setup();
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
	@After
	public void closebrowser()
	{

		System.out.println("Tc001 is pass");
	}
}
