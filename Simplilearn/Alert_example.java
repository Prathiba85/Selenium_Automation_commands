package Simplilearn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		 //Add admin@the internet : You can pas s the username and password from excel or csv file
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			WebElement clickme = driver.findElement(By.xpath("//button[@id='alertButton']"));
		
			clickme.click();
			Alert obj = driver.switchTo().alert();
			Thread.sleep(2000);
			obj.accept();
			
			//cancelbutton
			WebElement clickme_cancel = driver.findElement(By.xpath("//button[@id='confirmButton']"));
			clickme_cancel.click();
			Thread.sleep(2000);
			obj.dismiss();

	}

}
