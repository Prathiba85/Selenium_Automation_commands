package Selenium_commands;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_basic_methods {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//c.wait(10000);
		//Method 1
		driver.get("https://www.saucedemo.com/");
		//Method 2
		driver.manage().window().maximize();
	
		
		//3. getcurrent Url -it will return a atring.
		String S = driver.getCurrentUrl();
		
		System.out.println("Current Url :"+S);
		
		//4. getTitle
		System.out.println("Title : "+driver.getTitle());
		
		//5. getpagesource
		
		System.out.println("PageSource "+driver.getPageSource());
		
		//6. navigate
		//driver.navigate().to("https://www.google.com/");
		//7 quit /close
		//driver.close();
		//8.findElement By &Find Elements By
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		//driver.findElements(By.xpath)
		java.util.List<WebElement> all_product = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		
		for(WebElement a:all_product)
		{			System.out.println(a.getText());
		}
		
	 
		//9.getwindowHandle ()
		driver.navigate().to("https://www.sugarcrm.com/");
		String windowhandle =  driver.getWindowHandle();
		System.out.println(windowhandle);
		driver.findElement(By.xpath("//a[text()='Get A Demo']")).click();
		
		//10.getWindowHandles()
		
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandle);
		driver.close();
}
}
