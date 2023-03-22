package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		/* single iframe
		driver.get("https://selectorshub.com/iframe-scenario/ ");
		driver.switchTo().frame(driver.findElement(By.xpath(" //iframe[@id='pact1']")));
		driver.findElement(By.xpath(" //input[@id='inp_val'] ")).sendKeys("testing");*/
		
		//Multiple iframe -Nested iframe - //iframe[@id="pact2"]
		
		driver.get("https://selectorshub.com/iframe-scenario/ ");
		driver.switchTo().frame(driver.findElement(By.xpath(" //iframe[@id='pact1']")));
		driver.switchTo().frame(driver.findElement(By.xpath(" //iframe[@id='pact2']")));
		driver.findElement(By.xpath(" //input[@id='jex'] ")).sendKeys("testing");

	}

}
