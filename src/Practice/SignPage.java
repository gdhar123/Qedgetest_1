package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignPage {

	public static void main(String[] args) 
	{
      
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("srini");
		driver.findElement(By.name("password")).sendKeys("pwd4tour");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Flights")).click();
		
 

	}

}
