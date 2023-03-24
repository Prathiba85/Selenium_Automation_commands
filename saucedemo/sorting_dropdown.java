package saucedemo;

import java.util.List;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sorting_dropdown {
	//The objective of this testcase is to print all the element in drop down list and also to sort the list and test.
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Call login function
		login obj_login = new login();
		login.userlogin();
		sorting sortobj=new sorting();
		sortobj.sorting_item();
	

	}
}

class sorting
{
	WebDriver driver;
	
	sorting()
	{
		this.driver=login.driver;
	}
	
	public void sorting_item() throws InterruptedException
	{
		//Printing all the element
		
		List <WebElement> dropdown = driver.findElements(By.xpath("//select[@class='product_sort_container']/option"));
		
		for(WebElement item:dropdown)
		{
			System.out.println(item.getText());
		}
		
		System.out.println("Sorted items Z to A");
		
		WebElement sorta_z = driver.findElement(By.xpath("//select[@class='product_sort_container']/option[@value='za']"));
		sorta_z.click();
		Thread.sleep(2000);
		
		System.out.println("Sorted items High to Low");
		WebElement Price_hightolow = driver.findElement(By.xpath("//select[@class='product_sort_container']/option[@value='hilo']"));
		Price_hightolow.click();
}
}
