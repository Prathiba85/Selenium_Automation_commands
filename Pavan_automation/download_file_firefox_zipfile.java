package Pavan_automation;

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

public class download_file_firefox_zipfile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				
		WebDriverManager.firefoxdriver().setup();
	
		//Firefox may have issues in downloading the files, so we need to set the profile
		FirefoxProfile profile =new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk","application/zip");
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		
		FirefoxOptions option =new FirefoxOptions();
		option.setProfile(profile);
		WebDriver driver = new FirefoxDriver(option);
		driver.get("http://testingmasters.com/student-corner/downloads/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement download = driver.findElement(By.xpath("//table[@id='tablepress-7']/tbody/tr[2]/td[3]"));
		download.click();
		
		
	}

}
