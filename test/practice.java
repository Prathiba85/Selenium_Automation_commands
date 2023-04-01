package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.DateFormatter;

public class practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://selectorshub.com/xpath-practice-page/");
		 driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		WebElement car_dropdown= driver.findElement(By.xpath("//select[@id='cars']"));
		Select sc =new Select(car_dropdown);
		sc.selectByVisibleText("Opel");
		//24 Take screenshot and save with title class and date and time.
		
Wait <WebDriver> wc = new FluentWait <WebDriver>(driver)
.pollingEvery(Duration.ofSeconds(20))
.withTimeout(Duration.ofSeconds(10))
.ignoring(NoSuchElementException.class);

JavascriptExecutor script = (JavascriptExecutor)driver;
script.executeScript("argument[o].scrollIntoView(true);", car_dropdown);
		


		
		
	
	
	}

}
