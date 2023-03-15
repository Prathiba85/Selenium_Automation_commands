package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class salesforce {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver= new EdgeDriver();
		driver.get(" https://login.salesforce.com/");
	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Testing");
		
		//input[@name='username']
		

	}

}
