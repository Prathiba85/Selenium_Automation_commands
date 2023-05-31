package Selenium_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop_simplilear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
			
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement from= driver.findElement(By.xpath("//a[text()=' BANK '] "));
		WebElement to= driver.findElement(By.xpath("//ol[@id='bank']/li[@class='placeholder'] "));
		Actions ac = new Actions (driver);
		/*kes class has ll the keys
		ac.sendKeys(Keys.PAGE_DOWN)
		.dragAndDrop(from, to)
		.build()
		.perform();*/
		ac.moveToElement(from).build().perform();
		ac.dragAndDrop(from, to).build().perform();
		
		//mousehover
		
		
		
	}

}
