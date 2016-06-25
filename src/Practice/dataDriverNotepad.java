package Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dataDriverNotepad
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		File f = new File("C:\\Program Files\\DataDrivenTest.txt");
		FileReader fr = new FileReader(f);
		Thread.sleep(4000);
		BufferedReader br = new BufferedReader(fr);
		String x =br.readLine();
		//String P[] =x.split(",");
		while(x!=null)
		{
			WebDriver obj= new FirefoxDriver();
			obj.get("https://accounts.google.com");
			Thread.sleep(5000);
			String y[]=x.split(",");
			obj.manage().window().maximize();
			obj.findElement(By.name("Email")).sendKeys(y[0]);
			Thread.sleep(3000);
			obj.findElement(By.id("next")).click();
			Thread.sleep(3000);
			if(y[1].equals("valid") && obj.findElement(By.id("Passwd")).isDisplayed())
			{
				System.out.println("Valid User Id Test Passed..");
				obj.findElement(By.id("Passwd")).sendKeys(y[2]);
				Thread.sleep(3000);
				obj.findElement(By.id("signIn")).click();
				Thread.sleep(20000);
				if(y[3].equals("valid") && obj.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")).isDisplayed())
				{
					System.out.println("Valid Password Test Passed..");
				}
				else if(y[3].equals("invalid") && obj.findElement(By.id("errormsg_0_Passwd")).isDisplayed())
				{
					System.out.println("Invalid Password Test Passed..");
				}
				else
				{
					System.out.println("Password Test Failed..");
				}
			}	
			else if(y[1].equals("invalid") && obj.findElement(By.id("errormsg_0_Email")).isDisplayed())
			{
				System.out.println("Invalid User Id Test Passed..");
				System.out.println(obj.findElement(By.id("errormsg_0_Email")).getText());
			}
			else
			{
				System.out.println("User Id Test Failed..");
			}
			obj.close();
			x=br.readLine();
		}
	
		
		//driver.close();
		
		
	}
	
	
}
