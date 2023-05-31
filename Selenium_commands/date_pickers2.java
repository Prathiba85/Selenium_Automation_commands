package Selenium_commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class date_pickers2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.expedia.com.au/");

		WebElement check_in = driver.findElement(By.xpath("//button[@id='d1-btn']"));
		check_in.click();
	
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//h2[text()='June 2023']"));
		
		JavascriptExecutor obj = (JavascriptExecutor) driver;
		obj.executeScript("arguments[0].scrollIntoView();", month);
		obj.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
		WebElement Date = driver.findElement(By.xpath("//h2[text()='June 2023']/following::button[@data-day='15'][1]"));
		Date.click();
		
		WebElement done =driver.findElement(By.xpath("//button[text()='Done']"));
		done.click();
		
		//WebElement accept =driver.findElement(By.xpath("//button[text()='Accept']"));
		//accept.click();
		
		/*picking up the month
		while(true)
		{
			String text = driver.findElement(By.xpath(" ")).getText();
			if(text.equals(month))
			{
				break;
			}
			else {
				driver.findElement(By.xpath("next"));
				
			}*/
					
		}

	}


