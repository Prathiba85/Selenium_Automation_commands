package Pavan_automation;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class Image_compare {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		/* getting screenshot
		WebElement image = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		Screenshot logoimagescreenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, image);
		ImageIO.write(logoimagescreenshot.getImage(),"png",new File("C://SeleniumPractice/logo/orange.png"));*/
		
		BufferedImage expectedImage = ImageIO.read(new File ("C://SeleniumPractice/logo/orange.png"));
		
		//Actual Image
		WebElement image = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		Screenshot logoimagescreenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, image);
		BufferedImage actualimage = logoimagescreenshot.getImage();
		
		/*Checking if the file created
		File f = new File ("C://SeleniumPractice/logo/orange.png");
		
		if(f.exists())
		{
			System.out.println("Image File Captured");
		}
		else
		{
			System.out.println("Image File Not Captured");
		}*/
		
		//Compare images 
		
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedImage, actualimage);
		if(diff.hasDiff()==true)
		{
			System.out.println("The images are different");
		}
		if(diff.hasDiff()==false)
		{
			System.out.println("The images are same");
		}
		
	}

}
