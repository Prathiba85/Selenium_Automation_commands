package Selenium_commands;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		 WebDriver driver = new FirefoxDriver();
	
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);
		//Capture Links/count number of Links/Size of the Link
		
		List <WebElement> alllinks= driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		Thread.sleep(5000);
		 
		for(int i=0;i<alllinks.size();i++)
		{
			WebElement weburl = alllinks.get(i);
			String url= weburl.getAttribute("href");
			
			
			
			//Special class to check the link
			
			URL weblink = new URL (url);
			//connection using link.
			HttpURLConnection httpCon =(HttpURLConnection) weblink.openConnection();
			Thread.sleep(2000);
			//Establish connection
			httpCon.connect();
			int rescode = httpCon.getResponseCode();
			if(rescode>=400)
			{
				System.out.println(url);
			}
			
		}
	}

}
