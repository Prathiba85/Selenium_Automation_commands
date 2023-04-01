package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window_simplilearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String childwindow = null;
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/browser-windows ");
		String parentwindow = driver.getWindowHandle();
		//System.out.println("Parent Window "+parentwindow);
	WebElement newtab = driver.findElement(By.id("tabButton"));
	newtab.click();
	Set<String>windowhandles = driver.getWindowHandles();
	String child_window ="";
	for(String window:windowhandles)
	{	
		if(!window.equals(parentwindow))
		{
		child_window = window;	
		}
		
	
	}
	//System.out.println("Child Window is :"+child_window);
	driver.switchTo().window(child_window);
	WebElement childheader =driver.findElement(By.id("sampleHeading"));
	//System.out.println("Header of child window "+childheader.getText());
	
	driver.close();
	driver.switchTo().window(parentwindow);
	WebElement newwindow = driver.findElement(By.id("windowButton"));
	newwindow.click();
	//Second window - New window
	Set<String>windowhandles_newwindow = driver.getWindowHandles();
	String child_window2 ="";
	for(String window:windowhandles_newwindow)
	{	System.out.println("The window id for new window is "+window);
		if(!window.equals(parentwindow))
		{
		child_window2 = window;	
		}
		
	
	}
	driver.switchTo().window(child_window2);
	WebElement childheader2 =driver.findElement(By.id("sampleHeading"));
	System.out.println("Header of child New window: "+childheader2.getText());
	driver.quit();
	}

}
