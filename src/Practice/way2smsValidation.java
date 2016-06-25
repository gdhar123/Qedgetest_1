package Practice;

import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class way2smsValidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://site23.way2sms.com/content/index.html");
		driver.manage().window().maximize();
		Scanner s =new Scanner(System.in);
		System.out.println("Enter mobile number");
		String mob = s.nextLine();
		driver.findElement(By.name("username")).sendKeys(mob);
		//driver.findElement(By.name("password")).sendKeys("xxyyxz");
		driver.findElement(By.xpath("//*[@id='loginBTN']")).click();
		Thread.sleep(4000);
		if(mob.length()<10 && ExpectedConditions.alertIsPresent()!=null)
		{
			System.out.println("Test Passed");
			Alert simpleAlert = driver.switchTo().alert();
			String alertText = simpleAlert.getText();
			System.out.println("Alert text is " + alertText);
			simpleAlert.accept();
			System.out.println("Enter valid Mobile numn");
			String CorrectM = s.nextLine();
			driver.findElement(By.name("username")).sendKeys(CorrectM);
			System.out.println("Enter pwd");
			String pwd = s.nextLine();
			System.out.println("Pwd critria");
			String Critiria = s.nextLine();
			driver.findElement(By.name("password")).sendKeys("pwd");
			if(pwd.equals("valid"))
			{
				System.out.println("Etered Pwd is correct");
				driver.findElement(By.id("loginBTN")).click();
				
			}else
			{
				System.out.println("Entered pwd is wrong");
			}
		}
	}

}
