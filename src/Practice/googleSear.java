package Practice;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleSear {

		public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");
		System.out.println(" Enter Search Text");
		Scanner s = new Scanner(System.in);
		String x = s.nextLine();
		
		driver.findElement(By.name("q")).sendKeys(x);
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(2000);
		String title= driver.getTitle();
		System.out.println(title);
		
		if(title.contains(x))
		{
			System.out.println(" Entered txt is contain");

		}else
		{
			System.out.println(" Enter text is not contain");
		}

	}

}
