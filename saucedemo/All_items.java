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


public class All_items {
	//The objective of this testcase is to get list of all the items from the website
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Call login function
		login obj_login = new login();
		login.userlogin();
		All_items orderitems_obj = new All_items ();
		orderitems_obj.itemslist();

	}
	
	public void itemslist()
	{
	
		List<WebElement> item_list = login.driver.findElements(By.xpath("//div[@class='inventory_item_description']"));
		System.out.println(item_list.size());

		
		for(WebElement item:item_list)	
		{		
		   String item_des= item.getText();
				   
		   String arr[]=item_des.split("\\r?\\n");
		   System.out.println(arr[0]+" "+arr[2]);
		   
			
		}

}
}
