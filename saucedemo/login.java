package saucedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class login {
	public static String browser = "chrome";//External configuration file xls,csv
	public static WebDriver driver ;
	public static String username = "standard_user";
	public static String password = "secret_sauce";
	public static String inventory_url="https://www.saucedemo.com/inventory.html";
	/*Usernames
	 * locked_out_user
	 * problem_user
	 * performance_glitch_user
	 * standard_user
	 */
	//The objective of this testcase is to check if the login is successful or not.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			login.userlogin();
			login login_obj = new login();
			login_obj.logout(inventory_url);	
			
	}
	
	public static void  userlogin()
	{
		//1. launch Browser		
		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		 driver.get("https://www.saucedemo.com/");
		}

		else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);
			driver.get("https://www.saucedemo.com/");
		}
		else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			driver.get("https://www.saucedemo.com/");
		}
		
		//2. Correct user name 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		String weburl= driver.getCurrentUrl();
		if (weburl.equals("https://www.saucedemo.com/inventory.html"))
		{
			System.out.println("**************Testcase with correct login details****************");
			System.out.println("Login successful");	
		}
	
		else
		{
			System.out.println("**************Testcase with incorrect username: "+username+"****************");
							System.out.println("Login unsuccessful");
			WebElement error= driver.findElement(By.xpath("//h3[@data-test='error']"));
			System.out.println("Error message is :"+error.getText());
			
			
		}
		
	}
	
	public void logout(String weburl)
	{
		//3.Logout- Successful login
		if (weburl.equals("https://www.saucedemo.com/inventory.html"))
		{
		WebElement sidemenu = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn'] "));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		sidemenu.click();
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
		driver.close();
		}
		else
		{
			driver.close();
		}
		
		
	}

}
