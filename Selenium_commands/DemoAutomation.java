package Selenium_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//IE driver
/*System.setProperty("webdriver.edge.driver","C:\\edgedriver_win64\\msedgedriver.exe");
		System.setProperty("webdriver.edge.driver","C:\\browserdriver\\msedgedriver.exe");		
EdgeDriver cr = new EdgeDriver();
cr.get("http://www.google.com");*/

		
		
	
	//Chrome browser
	

WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver c = new ChromeDriver(options);
	//c.wait(10000);
	c.get("http://www.google.com");
	
		
		
		/*Firefox
		System.setProperty("webdriver.gecko.driver","C:\\browserdriver\\geckodriver.exe");		
		FirefoxDriver cr = new FirefoxDriver();
		cr.get("http://www.google.com");*/
  
	}

}
