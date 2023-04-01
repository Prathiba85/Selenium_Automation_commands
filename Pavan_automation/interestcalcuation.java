package Pavan_automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class interestcalcuation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFCell principalcell ;
		XSSFCell interstcell;
		XSSFCell periodcell;
		XSSFCell Maturityvalue;
		//Launch browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true ");
		
		WebElement nothanks = driver.findElement(By.xpath("//button[text()='No thanks'] "));
		nothanks.click();
		FileInputStream interestfb = new FileInputStream("interest.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(interestfb);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int row_number = sheet.getPhysicalNumberOfRows();
		int column_number = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(row_number);
		System.out.println(column_number);
		
		for(int i =1;i<row_number;i++)
		{
			XSSFRow current_row = sheet.getRow(i);
			 principalcell = current_row.getCell(0); 
			 int principal= (int) principalcell.getNumericCellValue();
			 //System.out.println(principal);
			interstcell = current_row.getCell(1); 
			int interest = (int) interstcell.getNumericCellValue();
			
			periodcell = current_row.getCell(2);
			int period = (int) interstcell.getNumericCellValue();
			
			Maturityvalue = current_row.getCell(2);
			int value = (int) interstcell.getNumericCellValue();
			
			WebElement Principal = driver.findElement(By.xpath("//input[@id='principal']"));
			Principal.clear();
			Principal.sendKeys(String.valueOf(principal));
			//To send numeric values
			WebElement rate_of_interest = driver.findElement(By.xpath("//input[@id='interest']"));
			rate_of_interest.clear();
			rate_of_interest.sendKeys(String.valueOf(interest));
			
			WebElement screen_period=driver.findElement(By.xpath("//input[@id='tenure']"));
			screen_period.clear();
			screen_period.sendKeys(String.valueOf(period));
			
			WebElement years_dropdown= driver.findElement(By.xpath("//select[@id='tenurePeriod']/option[3]"));
			
			years_dropdown.click();
			
			WebElement frequency= driver.findElement(By.xpath("//select[@id='frequency']/option[@value='0']"));
			
			frequency.click();
			
			WebElement Calculate = driver.findElement(By.xpath("//a[@onclick='return getfdMatVal(this);']"));
			
			Calculate.click();
			
			
		}

	}

}
