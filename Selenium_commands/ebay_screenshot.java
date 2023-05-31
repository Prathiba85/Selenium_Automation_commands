package Selenium_commands;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ebay_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.ebay.com.au/");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
    //Current Date
    
    Date currentdate =new Date(000);
    
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
   String formatteddate = dtf.format(now);
   String screendhotfilename = formatteddate.toString().replace("/","_").replace(" ","_").replace(":","_");
		   
  
   System.out.println("Current Date : "+screendhotfilename);
	//Take Screenshots
	
	File screenshotfile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	//To save screenshots - common IO
	FileUtils.copyFile(screenshotfile, new File(".//screenshot/"+screendhotfilename+".png"));
	
	
	
	
	driver.close();

	}

}
