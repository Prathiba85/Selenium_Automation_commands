package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class salesforce {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver= new EdgeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.findElement(By.linkText("START MY FREE TRIAL")).click();
		//driver.get("https:google.com");
		//driver.findElement((By.xpath("//input[@title='Search']"))).sendKeys("testing");
		//driver.findElement(By.xpath("//input[@type='search']"));
	
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Testing");
	
		//driver.findElement(By.xpath("//input[@id='input']")).sendKeys("test");
		//driver.findElement(By.xpath("//Input[contains(@name,'email')]")).sendKeys("prathi@gmail.com");
		
		
		//*[@id="input"]
		//input[@name='username']
		

	}

}
