package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;

public class GooglSear {
	
	 public static void main(String[] args) throws InterruptedException
	
	{
		ProfilesIni P = new ProfilesIni();
		FirefoxProfile fp= P.getProfile("default");
		WebDriver driver = new FirefoxDriver(fp);
		
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("lst-ib")).sendKeys("pari");
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN, Keys.TAB, Keys.ENTER).build().perform();
		
		//driver.close();
		
		}

}
