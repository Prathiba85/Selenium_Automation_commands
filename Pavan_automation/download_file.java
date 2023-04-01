package Pavan_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class download_file {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
	
		WebElement textarea = driver.findElement(By.xpath("//textarea[@id='textbox']"));
		
		textarea.sendKeys("This is for testing");
		
		WebElement generate_file = driver.findElement(By.xpath("//textarea[@id='textbox']/ancestor::div[@class='panel-body']//button "));
		generate_file.click();
		WebElement download = driver.findElement(By.xpath("//a[@id='link-to-download']"));
		download.click();
		driver.get("http://testingmasters.com/student-corner/downloads/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement download1 = driver.findElement(By.xpath("//*[@id=\"tablepress-7\"]/tbody/tr[2]/td[3]/a"));
		download1.click();
		

	}

}
