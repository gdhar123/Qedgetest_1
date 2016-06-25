package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot 
{

	public static void main (String [] args) throws IOException, InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.name("Email")).sendKeys("qedgetest1122@gmail.com");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Passwd")).sendKeys("qwesaaa123");
		Thread.sleep(3000);
		driver.findElement(By.id("signIn")).click();
	    
	    File screnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screnshot, new File("c://screenshot.png"));
	    System.out.println("Bye");
	    driver.close();
	   	}
}
