package Selenium_commands;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		

	}

}
