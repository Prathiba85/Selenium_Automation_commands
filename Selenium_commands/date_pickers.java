package Selenium_commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class date_pickers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		String month ="January 2024";
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://phptravels.net/");

		WebElement depart_date = driver.findElement(By.xpath("/html/body/div[7]/div[1]/table"));
		depart_date.click();
	
		Thread.sleep(2000);
		//WebElement accept =driver.findElement(By.xpath("//button[text()='Accept']"));
		//accept.click();
		
		//picking up the month
		while(true)
		{
			String text = driver.findElement(By.xpath(" ")).getText();
			if(text.equals(month))
			{
				break;
			}
			else {
				driver.findElement(By.xpath("next"));
				
			}
					
		}
		
	WebElement day=	driver.findElement(By.xpath("Day"));
	day.click();

	}

}
