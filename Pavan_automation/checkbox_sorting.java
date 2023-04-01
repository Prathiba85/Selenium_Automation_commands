package Pavan_automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> animals = driver.findElements(By.xpath("//select[@name = 'animals']/option"));
		
		ArrayList original = new ArrayList();
		ArrayList temporary = new ArrayList();
		
		for(WebElement animal:animals)
		{
			original.add(animal.getText());
			temporary.add(animal.getText());
		}
		
		Collections.sort(temporary);
		
		if(original.equals(temporary))
			System.out.println("same");
		else
			System.out.println("different");
	}

}
