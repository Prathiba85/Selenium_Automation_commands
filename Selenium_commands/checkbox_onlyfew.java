package Selenium_commands;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox_onlyfew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    
	   List <WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox'] "));
	   int size = allcheckbox.size();
	   System.out.println(size);
	   
	   for(int i=10;i<size-70;i++)
	   {
		   allcheckbox.get(i).click();
	   }
	}

}
