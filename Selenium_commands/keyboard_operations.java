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

public class keyboard_operations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
			
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		
		WebElement textbox=driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[14]/pre"));
		Actions keyboard = new Actions(driver);
		Thread.sleep(5000);
		keyboard.keyDown(textbox,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		WebElement targettextbox=driver.findElement(By.xpath("//*[@id=\'dropZone2\']/div[2]/div/div[6]"));		
		Thread.sleep(2000);
		keyboard.keyDown(targettextbox,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		
		/*
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		WebElement organgesquare=driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
		Actions rightclick = new Actions(driver);
		rightclick.contextClick(organgesquare).perform();*/
	
		
	}

}
