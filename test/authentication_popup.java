package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class authentication_popup {
	 public static String username ="admin";
	 public static String password ="admin";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		 WebDriver driver = new FirefoxDriver();
		
		 //Add admin@the internet : You can pas s the username and password from excel or csv file
			driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
	}

}
