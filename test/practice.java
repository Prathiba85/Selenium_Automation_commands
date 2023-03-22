package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://selectorshub.com/xpath-practice-page/");
		 driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		WebElement car_dropdown= driver.findElement(By.xpath("//select[@id='cars']"));
		Select sc =new Select(car_dropdown);
		sc.selectByVisibleText("Opel");

	}

}
