package Selenium_commands;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cookies_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.firefoxdriver().setup();
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.amazon.in/");
		 Set<Cookie> cookies = driver.manage().getCookies();
		
         System.out.println("Size of Cookies"+ cookies.size()); //print size of cookies.
         for(Cookie c:cookies)
         {
        	 System.out.println("Name is :"+c.getName()+" Value is :"+ c.getValue());
         }
         
         System.out.println(driver.manage().getCookieNamed("session-id-time"));
         //add new cookie to the browser
         Cookie cobj = new Cookie("mycookie","754567890");
         driver.manage().addCookie(cobj);
         for(Cookie c:cookies)
         {
        	 System.out.println("Name is :"+c.getName()+" Value is :"+ c.getValue());
         }
         Cookie cobj1 = new Cookie("mycookie","1234567890");
         driver.manage().addCookie(cobj1);
        
         driver.manage().deleteAllCookies();
         cookies = driver.manage().getCookies();
         System.out.println(cookies.size());
         driver.quit();
	}

}
