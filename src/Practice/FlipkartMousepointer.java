package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMousepointer {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/header/div[1]/div/ul/li[1]/a/span[1]")).click();
		WebElement w = driver.findElement(By.xpath("html/body/div[1]/div/div/header/div[1]/div/ul/li[1]/ul/li[2]/ul/li[2]/ul/li[2]/a/span"));
		Actions a = new Actions(driver);
		a.moveToElement(w).contextClick().build().perform();
		//int x = driver.findElement(By.xpath("html/body/div[1]/div/div/header/div[1]/div/ul/li[1]/ul/li[2]/ul/li[2]/ul/li[2]/a/span")).getLocation().getX();
		//int y = driver.findElement(By.xpath("html/body/div[1]/div/div/header/div[1]/div/ul/li[1]/ul/li[2]/ul/li[2]/ul/li[2]/a/span")).getLocation().getY();
		//Actions a = new Actions(driver);
		//a.moveByOffset(x,y).build().perform();
		System.out.println("Bye");
	}
}
