package Pavan_automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascript_flash {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://twoplugs.com ");
		/*Flashing
		WebElement joinfree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
		javascript_util.flash(joinfree, driver);*/
		
		//Drawing border
		WebElement joinfree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
		javascript_util.drawBorder(joinfree, driver);
		
		//Capture Screenshot
		
		File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File trg = new File ("twoplugs.png");
		FileUtils.copyFile(src, trg);
		
		//Capture title of the page
		String title = javascript_util.getTitleByJS(driver);
	System.out.println(title);
	
	//Click element
	//WebElement loginbtn =driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));
	
	//javascript_util.clickElementByJS(loginbtn, driver);
		
	//Generate Alert
	//javascript_util.generateAlert(driver,"you clicked on login button...");
	
	//refresh page
	//javascript_util.refreshBrowserByJS(driver);
	
	//Scrolling the page	
	
	WebElement image = driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
	
	javascript_util.scrollintoView(image, driver);
	
	javascript_util.scrollpagedown(driver);
	
	}

}
