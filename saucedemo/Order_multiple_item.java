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

public class Order_multiple_item {
	//The objective of this testcase is to add two item to the cart and remove one item from cart and checkout one item successfully
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Call login function
		login obj_login = new login();
		login.userlogin();
		Order orderitems_obj = new Order ();
		orderitems_obj.Order_item();

	}
}

class Order
{
	WebDriver driver;
	
	Order()
	{
		this.driver=login.driver;
	}
	
	public void Order_item() throws InterruptedException
	{
		//Add two item to the cart
		WebElement item1=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and text()='Add to cart']"));
		item1.click();
		WebElement item2=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt' and text()='Add to cart']"));
		item2.click();
		WebElement shopping_cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		shopping_cart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Remove one item
		WebElement remove=driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']"));
		remove.click();
		//checkout
		WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		Thread.sleep(2000);
		checkout.click();
		
		
		
		//Enter Checkout info
		WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
		firstname.sendKeys("Prathiba");
		WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
		lastname.sendKeys("Sankar");
		WebElement zipcode = driver.findElement(By.xpath("//input[@name='postalCode']"));
		zipcode.sendKeys("2606");
		WebElement nextpage = driver.findElement(By.xpath("//input[@name='continue']"));
		nextpage.click();
		Thread.sleep(2000);
		//Finish
		WebElement finish = driver.findElement(By.xpath("//button[@id='finish']"));
		finish.click();
		
		driver.close();

}
}
