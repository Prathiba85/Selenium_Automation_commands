package Selenium_commands;

import java.util.Set;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class switch_windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String childwindow = null;
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
	
		driver.get("https://selectorshub.com/xpath-practice-page/ ");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Checkout here']")).click();
		driver.findElement(By.xpath("//div[@class='dropdown-content']/a[2] ")).click();
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window handle "+parentwindow);
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		java.util.Iterator<String> itr = windowhandles.iterator();
		
		for (int i=0;i<1;i++)
		{
			 childwindow = itr.next();
		}
		
		//String parentwindow = itr.next();
		//String childwindow = itr.next();
		//System.out.println("Parentwindow :"+parentwindow);
		System.out.println("Child window : "+childwindow);
		
		/*havascript
		 * JavascriptExecutor object = (JavascriptExecutor) driver;		
		 * object.executeScript("arguments[0].scrollIntoView();",element);
		 */
		driver.switchTo().window(childwindow);
		
		System.out.println(driver.getTitle());
	
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());

	}

}
