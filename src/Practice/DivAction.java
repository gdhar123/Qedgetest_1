package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DivAction {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.linkText("Create account")).click();
		driver.findElement(By.name("FirstName")).sendKeys("srinivas12345");
		driver.findElement(By.name("LastName")).sendKeys("ttt");
		driver.findElement(By.id("GmailAddress")).sendKeys("srinivas12345");
		driver.findElement(By.name("Passwd")).sendKeys("srinivas12345");
		driver.findElement(By.name("PasswdAgain")).sendKeys("srinivas12345");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		/*driver.findElement(By.xpath("//*[@id='BirthMonth']/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=':3']/div")).click();
		*/
		Actions a = new Actions(driver);
		
		a.sendKeys(Keys.TAB,"February",Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("BirthDay")).sendKeys("08");
		driver.findElement(By.id("BirthYear")).sendKeys("1982");
		Thread.sleep(2000);
		
		a.sendKeys(Keys.TAB,"Male",Keys.ENTER).build().perform();
		//a.sendKeys("Male");
		//a.sendKeys(Keys.ENTER);
		a.sendKeys(Keys.TAB,"India",Keys.ENTER).build().perform();
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("9989901431");
		driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("srinivas12345@gmail.com");
		driver.findElement(By.id("SkipCaptcha")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
