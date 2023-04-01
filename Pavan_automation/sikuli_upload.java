package Pavan_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sikuli_upload {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		/*WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);*/
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
		
		String imagesFilePath = "C:\\SeleniumPractice\\";
		String inputFilePath = "C:\\SeleniumPractice\\";
		Screen s = new Screen();
	
		Pattern fileInputTextbox = new Pattern(imagesFilePath+"textbox.PNG");
		Pattern openButton = new Pattern(inputFilePath+"open.PNG");
		Thread.sleep(5000);
		s.wait(fileInputTextbox,20);
		s.type(fileInputTextbox,inputFilePath+"textbox.PNG");
		s.click(openButton);
		

	}

}
