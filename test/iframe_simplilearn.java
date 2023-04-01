package test;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe_simplilearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String childwindow = null;
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/browser-windows ");
		WebElement frame_box = driver.findElement(By.xpath("//li[@id='item-2']/ancestor::div[@class='element-list collapse show']/ul/li[3]"));
		frame_box.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
		//driver.switchTo().frame(driver.findElement(By.xpath(" //iframe[@id='pact1']")));
		WebElement Header = driver.findElement(By.id("sampleHeading"));
		System.out.println("Header is " + Header.getText());
		
		driver.switchTo().defaultContent();

	
		
	}
}
