package Selenium_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_basicmethos01 {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//c.wait(10000);
		driver.get("https://accounts.simplilearn.com/user/register-email");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("testing");
		firstname.clear();
		//get Attribute
		System.out.println(firstname.getAttribute("class"));
		//css attributes are available in style
		System.out.println("CSS Attribute: "+firstname.getCssValue("box-sizing"));
		//get size give size of the button
		System.out.println("size: " +firstname.getSize());
		//get tag name
	
		System.out.println("Tagname: "+firstname.getTagName());
		
		//isEnabled
		System.out.println("Location: "+firstname.getLocation());
		System.out.println("Enabled : "+firstname.isEnabled());
		System.out.println("Selected: "+firstname.isSelected());
		System.out.println("Displayed : "+firstname.isDisplayed());

		//gettext -
		driver.findElement(By.xpath("//input[@value='Create Account']"));
		System.out.println(driver.findElement(By.xpath("//input[@value='Create Account']")));
}
}
