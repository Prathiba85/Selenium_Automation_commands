package Pavan_automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javascript_util {
	
	public static void flash (WebElement element,WebDriver driver)
	{
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i=0;i<500;i++)
		{
			changeColor("#000000",element,driver);
			changeColor(bgcolor,element,driver);
		}
	}
	
	public static void changeColor(String color,WebElement element,WebDriver driver)
	{
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",element);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
			
		}
	}
	
	public static void drawBorder(WebElement element,WebDriver driver)
	{
		
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border ='3px solid red'",element);
	}
	
	public static String getTitleByJS(WebDriver driver)
	{
				
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		String Title = js.executeScript("return document.title;").toString();
		return Title;
	}

	public static void clickElementByJS(WebElement element,WebDriver driver)
	{		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}
	public static void generateAlert(WebDriver driver,String message)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}

	public static void refreshBrowserByJS(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	
	//Scrolling down the page
	public static void scrollintoView(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
				
					}
	public static void scrollpagedown(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				
		}
}
