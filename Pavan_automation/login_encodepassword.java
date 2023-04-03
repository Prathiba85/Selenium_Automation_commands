package Pavan_automation;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_encodepassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		WebElement Email = driver.findElement(By.xpath("//input[@class='email']"));
		Email.sendKeys("pavanoltraining@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@class='password']"));
		password.sendKeys(decodeString("dGVzdDEyMw=="));
		WebElement login = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
		login.click();

	}

	static String decodeString(String password)
	{
		byte[] decodedString = Base64.decodeBase64(password);
		System.out.println("decoded String :"+new String (decodedString)); 
		return password;
		
	}
}
