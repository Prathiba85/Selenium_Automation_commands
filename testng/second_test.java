package testng;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class second_test {

	public static WebDriver driver;

	@BeforeClass
	//@Test(priority=1)

	void TC001_open_applicaiton() {

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Test(priority=2)
	void TC002_login_applicaiton() {

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@AfterClass
	//@Test(priority =3)
	void TC003_close_applicaiton() {
		driver.quit();
	}
}
