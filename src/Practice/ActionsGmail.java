package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ActionsGmail {

	public static void main(String[] args)
	{
		
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile fp = p.getProfile("default");
		
		WebDriver driver = new FirefoxDriver(fp);
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("Email")).sendKeys("qedgetest1122");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/input")).click();
		
		boolean b = driver.findElement(By.name("PersistentCookie")).isSelected();
		if(b=true)
		{
			driver.findElement(By.name("PersistentCookie")).click();
		}
		
		driver.findElement(By.name("Passwd")).sendKeys("test@12345");
		driver.findElement(By.id("signIn")).click();
		driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")).click();
		driver.findElement(By.name("to")).sendKeys("Srinivastoom@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Test this");
		WebElement we = driver.findElement(By.xpath("html/body/div[13]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[2]/div[2]/div"));
		we.sendKeys("This dummy \n  This Test");
		
		driver.close();
		
		
	}

}
