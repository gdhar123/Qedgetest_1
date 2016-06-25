package Practice;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gamilValidation {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter User Id");
		String Uid = s.nextLine();
		System.out.println("Enter User id Critria");
		String Ucritria = s.nextLine();
		driver.findElement(By.id("Email")).sendKeys(Uid);
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		if(Ucritria.equals("valid") && driver.findElement(By.id("Passwd")).isDisplayed())
		{
			System.out.println("Valid user id Test Passed");
			System.out.println("Enter Pwd");
			String pwd = s.nextLine();
			System.out.println("Enter Pwd Critria");
			String pwdCritria = s.nextLine();
			driver.findElement(By.id("Passwd")).sendKeys(pwd);
			driver.findElement(By.id("signIn")).click();

			if(pwdCritria.equals("vaild") && driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")).isDisplayed())
			{
				System.out.println("Valid pwd test passed");
			}
			else if(pwdCritria.equals("invalid") && driver.findElement(By.id("errormsg_0_Passwd")).isDisplayed())

			{
				System.out.println("Invalid Password Test Passed..");
				System.out.println(driver.findElement(By.id("errormsg_0_Passwd")).getText());
			}
			else
			{
				System.out.println("Password Test Failed..");
			}
		}	
		else if(Ucritria.equals("invalid") && driver.findElement(By.id("errormsg_0_Email")).isDisplayed())
		{
			System.out.println("Invalid User Id Test Passed..");
			System.out.println(driver.findElement(By.id("errormsg_0_Email")).getText());
		}
		else
		{
			System.out.println("User Id Test Failed..");
		}
		//driver.close();
	}
}


