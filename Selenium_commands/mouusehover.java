package Selenium_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouusehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		WebElement Electronics = driver.findElement(By.xpath(("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")));
		WebElement todays_deal = driver.findElement(By.xpath("//*[@id=\"items_list1\"]/div[1]/div/div[1]/h2/a"));
		Thread.sleep(2000);
		Actions mouse = new Actions(driver);
		mouse.scrollToElement(todays_deal).perform();
		//mouse.moveToElement(Electronics).perform();
		

	}

}
