package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectorhub_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> row= driver.findElements(By.xpath("//table[@id='resultTable']//tbody/tr"));
		
		System.out.println(row.size());
		List<WebElement> column= driver.findElements(By.xpath("//table[@id='resultTable']//tbody//tr[1]/td"));

		System.out.println(column.size());
		
		for(int i=1;i<=row.size();i++)
		{
			for(int j=2;j<=column.size();j++)
			{
				WebElement cell = driver.findElement(By.xpath("//table[@id='resultTable']//tbody//tr["+i+"]/td["+j+"]"));
				System.out.print(cell.getText()+"   ");
			}
			System.out.println();
		}
	}

}
