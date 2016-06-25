package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WaySms {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://site23.way2sms.com/content/index.html");
		//driver.findElement(By.xpath("//*[@id='mlocator']")).sendKeys("9989901431");
		//driver.findElement(By.xpath("//*[@id='header']/div/div/input[2]")).click();
		//driver.close();
		driver.findElement(By.name("username")).sendKeys("9989901431");
		driver.findElement(By.name("password")).sendKeys("xxyyxz");
		driver.findElement(By.xpath("//*[@id='loginBTN']")).click();
		Thread.sleep(4000);
			
		//driver.findElement(By.xpath("//*[@id='sendSMS']/a")).click();
		
		
		driver.findElement(By.xpath("//*[@id='mlocator']")).sendKeys("9989901431");
		driver.findElement(By.xpath("//*[@id='traphead']/div[1]/div/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id='ebFrm']/div[2]/div[1]/input")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='sendSMS']/a")).click();
		
		driver.switchTo().frame("frame");
		driver.findElement(By.name("mobile")).sendKeys("9989901431");
		driver.findElement(By.xpath("//*[@id='message']")).sendKeys("I am Running my Script");
		driver.findElement(By.xpath("//*[@id='Send']")).click();
		String str = driver.findElement(By.xpath("html/body/form/div[3]/div/p/span")).getText();
		System.out.println("Disaplyed Test is: " + str);
		
		//driver.findElement(By.xpath("//*[@id='u_cont_4']")).click();
		//driver.findElement(By.xpath("//*[@id='message']")) .sendKeys("hi how r u doing");
		//driver.findElement(By.xpath("//*[@id='Send']")).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id='mainBody']/div[5]/div/ul/li[7]/i")).click();
		driver.quit();
		
	}

}
