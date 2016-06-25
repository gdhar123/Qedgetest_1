package Practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pageCount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Search word");
		String str = s.nextLine();
		driver.findElement(By.name("q")).sendKeys(str);

		driver.findElement(By.name("btnG")).click();
		Thread.sleep(4000);

		int count=1;
		while(driver.findElement(By.id("pnnext")).isDisplayed())
		{
			driver.findElement(By.id("pnnext")).click();
			Thread.sleep(4000);
			count = count+1;
		}
		System.out.println(count);
	}



}

