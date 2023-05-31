package Selenium_commands;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v108.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class download_file_firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		WebDriverManager.firefoxdriver().setup();

		//Firefox may have issues in downloading the files, so we need to set the profile
		FirefoxProfile profile =new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk","text/plain");
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		
		//download files in desired location
		profile.setPreference("browser.download.dir","C:\\Downloadedfiles");
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("pdjs.disabled", true);
		
		FirefoxOptions option =new FirefoxOptions();
		option.setProfile(profile);
		WebDriver driver = new FirefoxDriver(option);
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		
		
		WebElement textarea = driver.findElement(By.xpath("//textarea[@id='textbox']"));//setMIME types
		
		//you can find MIME type - sitepoint.com/mime-types-complete-list
		
		textarea.sendKeys("This is for testing");
		
		WebElement generate_file = driver.findElement(By.xpath("//textarea[@id='textbox']/ancestor::div[@class='panel-body']//button "));
		generate_file.click();
		WebElement download = driver.findElement(By.xpath("//a[@id='link-to-download']"));
		download.click();
		String path ="C:\\Downloadedfiles";
		if(isFileExist("C:\\\\Downloadedfiles"))
		{
			System.out.println("file exists");
		}
		else
		{
			System.out.println("file doesn't exists");
		}

	}

	private static boolean isFileExist(String path) {
		// TODO Auto-generated method stub
		File f = new File (path);
		if(f.exists())
		{
			return true;
		}
		return false;
	}

}
