package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_dropdown {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//c.wait(10000);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='tablepress-1_length']"));
		Select select =new Select(dropdown);
		System.out.println(select.getAllSelectedOptions());
		select.selectByValue("10");
		select.selectByIndex(3);
		select.selectByVisibleText("50");
		
		//deselect is availabe for multiselect.
		
		
}
}
