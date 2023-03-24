package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class expired_ssl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities handleSSLerror = new DesiredCapabilities();
		WebDriverManager.firefoxdriver().setup();


		//Global Profile

		handleSSLerror = new DesiredCapabilities();
		handleSSLerror.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		//handleSSLerror.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
	
		//
		FirefoxOptions eoptions =new FirefoxOptions();
		eoptions.merge(handleSSLerror);
		
		WebDriver driver = new FirefoxDriver(eoptions);
		driver.get("https://expired.badssl.com/");
		

	}

}
