package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouusehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		WebElement Electronics = driver.findElement(By.xpath(("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(Electronics).perform();
		

	}

}
