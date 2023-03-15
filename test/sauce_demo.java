package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sauce_demo {

	public static String browser = "edge";//External configuration file xls,csv
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
			driver.get("https://www.saucedemo.com/");
		}

		else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);
			driver.get("https://www.saucedemo.com/");
		}
		else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			driver.get("https://www.saucedemo.com/");
		}
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.close();

	}

}
