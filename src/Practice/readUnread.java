package Practice;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class readUnread 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		Scanner s =new Scanner(System.in);
		System.out.println("Enter user name");
		String Uname = s.nextLine();
		driver.findElement(By.id("Email")).sendKeys(Uname);
		driver.findElement(By.id("next")).click();
		System.out.println("Enter PWD");
		String pwd = s.nextLine();
		driver.findElement(By.id("Passwd")).sendKeys(pwd);
		driver.findElement(By.id("signIn")).click();

		int emailcount =0, unreadmails=0, readmails = 0;
		do{
			WebElement table = driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div[7]/div/div[1]/div[2]/div/table/tbody"));
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			int numofmail = rows.size();
			
			emailcount = emailcount+numofmail;
			
			for(int i=0;i<numofmail;i++)
			{
				List<WebElement> ls = rows.get(i).findElements(By.tagName("b"));
				if(ls.size()!=0)
				{
					unreadmails = unreadmails+1;
					
				}else
				{
					readmails = readmails+1;
					
				}
			}
			
			
			
			try{
				//if(obj.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/span/div[3]")).getAttribute("aria-disabled").equals(true))

				if(driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/span/div[3]")).getAttribute("aria-disabled").equals("true"))
				{
					System.out.println("Exit from loop..");
					break;

				}
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/span/div[3]")).click();
				Thread.sleep(5000);
			}
		}while(2>1);
		System.out.println("No.of all mails = "+emailcount);

		System.out.println("No.of all readmails = "+readmails);
		System.out.println("No.of all unreadmails = "+unreadmails);

	}

}
