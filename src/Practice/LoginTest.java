package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver obj = new FirefoxDriver();
		obj.get("http://newtours.demoaut.com/");
		obj.findElement(By.linkText("REGISTER")).click();
		obj.findElement(By.name("firstName")).sendKeys("Srinivas");
		obj.findElement(By.name("lastName")).sendKeys("Toom");
		obj.findElement(By.name("phone")).sendKeys("9848022338");
		obj.findElement(By.name("userName")).sendKeys("abc@gmail.com");
		obj.findElement(By.name("city")).sendKeys("Hyderabad");
		obj.findElement(By.name("postalCode")).sendKeys("500081");
		Thread.sleep(5000);
		
		Select s = new Select(obj.findElement(By.name("country")));
		
		//s.selectByIndex(5);
		//s.selectByVisibleText("INDIA");
		s.selectByValue("92");
		obj.findElement(By.name("email")).sendKeys("srini");
		obj.findElement(By.name("password")).sendKeys("pwd4tour");
		obj.findElement(By.name("confirmPassword")).sendKeys("pwd4tour");
		obj.findElement(By.name("register")).click();
		Thread.sleep(5000);
		//obj.close();
		obj.quit();
		
		
	}

}
