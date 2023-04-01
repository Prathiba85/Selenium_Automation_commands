package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascript_executor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		//print title
		JavascriptExecutor jsexec = (JavascriptExecutor) driver;
		String script = "return document.title;";
		String title = (String) jsexec.executeScript(script);
		System.out.println(title);
		
		//click the button
		
		driver.switchTo().frame("iframeResult");
		jsexec.executeScript("myFunction()");	
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		
		
		//highlight button
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		jsexec.executeScript("arguments[0].style.border='5px solid green'",button);
		
		//scroll
		driver.navigate().to("https://www.w3schools.com/");
		WebElement Kotlin =driver.findElement(By.xpath("//h2[text()='Kotlin']"));
		jsexec.executeScript("arguments[0].scrollIntoView(true);", Kotlin);
		
	}

}
