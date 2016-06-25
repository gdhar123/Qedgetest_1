package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScrt {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://site23.way2sms.com/content/index.html");
		driver.findElement(By.name("username")).sendKeys("9989901431");
		driver.findElement(By.name("password")).sendKeys("xxyyzz");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("validate();");
		js.executeScript("goToMain('s');");
		
		driver.findElement(By.xpath("//*[@id='sendSMS']/a")).click();
		driver.findElement(By.xpath("//*[@id='traphead']/div[1]/div/a")).click();
	}
	}