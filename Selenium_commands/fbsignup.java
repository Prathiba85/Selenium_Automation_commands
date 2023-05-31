package Selenium_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fbsignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//c.wait(10000);
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		WebElement signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']\r\n"));
		signup.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
		WebElement mobile = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		WebElement password = driver.findElement(By.xpath("//input[@data-type='password']"));
		firstname.sendKeys("prathiba");
		lastname.sendKeys("sankar");
		mobile.sendKeys("43300814");
		password.sendKeys("test");
		

		//dropdown
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select sday= new Select(day);
		//sday.selectByValue("10");
		sday.selectByVisibleText("10");
		
		//select[@title='Month']
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select smonth = new Select(month);
		smonth.selectByValue("3");
		
		//year
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select syear = new Select(year);
		syear.selectByValue("1985");
		
		//Select gender
		WebElement female =driver.findElement(By.xpath("//input[@type ='radio' and @value='1']"));
		female.click();
		
		String gender ="Male";
		
		String genderxpath = "//label[text()='placeholder']";
		String newxpath =genderxpath.replace("placeholder", gender);
		
		System.out.println("new xpath "+newxpath);
		WebElement gendergiven=driver.findElement(By.xpath(newxpath)) ;
		gendergiven.click();
		
		
		
		

	}

}
