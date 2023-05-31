package Selenium_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//span[text()='From']")).click();	
		WebElement from = 	driver.findElement(By.xpath("//input[@placeholder='From']"));
		//Thread.sleep(5000);
		
		from.sendKeys("Sydney");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
	    from.sendKeys(Keys.ENTER);
		
		
		
	}

}
