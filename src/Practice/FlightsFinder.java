package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlightsFinder {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver obj = new FirefoxDriver();
		obj.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		System.out.println("Launched");
		obj.findElement(By.linkText("Flights")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click();
		System.out.println("clicked");
		String title = obj.getTitle();
		System.out.println("title of th epage :" +title);
		
	   String currUrl = obj.getCurrentUrl();
	   System.out.println("Current url is " +currUrl );
		
	   obj.close();
	}
}
