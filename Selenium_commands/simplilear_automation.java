package Selenium_commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class simplilear_automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.simplilearn.com ");
		WebElement login = driver.findElement(By.className("login"));
		List<WebElement> website =   driver.findElements(By.tagName("a"));
		
		for(WebElement a: website)
		{
			System.out.println(a.getAttribute("href"));
		}
		
		//String s = login.getAttribute("href");
		//System.out.println(s);
		

	}

}
