package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTabl {
	public static void main (String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://accounts.google.com");
		driver.findElement(By.name("Email")).sendKeys("qedgetest1122");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.name("PersistentCookie")).isSelected();
	
		boolean b = driver.findElement(By.name("PersistentCookie")).isSelected();
		System.out.println("Check box is selected");
		if(b=true)
		{
			driver.findElement(By.name("PersistentCookie")).click();
			
		}
		
		driver.findElement(By.name("Passwd")).sendKeys("test@12345");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(3000);
		
		WebElement table = driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div[7]/div/div[1]/div[2]/div/table/tbody"));
													
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int rs =rows.size();
		System.out.println("Row Size is: " +rs);
		List<WebElement> col = rows.get(0).findElements(By.tagName("td"));
		int column = col.size();
		System.out.println("Column Size" +column);
		String st = col.get(3).getText();
		
		System.out.println(st);
		
						
		
	//driver.close();
	
	}

}
