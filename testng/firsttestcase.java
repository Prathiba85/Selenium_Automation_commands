package testng;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firsttestcase {
	
	@BeforeMethod
	public void startbrowser()
	{

		WebDriverManager.chromedriver().setup();
		System.out.println("Before testcase");
	}
	//Order of execution of test case depends on testname 
	//BM-->T1-->AM
	//BM-->T2-->AM
	//BM-->T3--AM
	@Test
	public void Tc002()
	{
		EdgeDriver cr = new EdgeDriver();
		cr.get("http://www.google.com");
		cr.close();
		
	
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
	
	@AfterMethod
	public void closebrowser()
	{

		System.out.println("After testcase");
	}

}
