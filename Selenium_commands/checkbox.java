package Selenium_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//Action class
		Actions action = new Actions(driver);
		WebElement checkbox = driver.findElement(By.xpath("//tr[@class='row-2 even']//input[@type='checkbox']"));
		 driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		action.moveToElement(checkbox);
		checkbox.click();
		
		
	
		
		
	
		
		
	}

}
