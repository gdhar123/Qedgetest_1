package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ArrayInfosys {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.infosys.com/careers/job-opportunities/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("SEARCH FOR JOBS IN INDIA")).click();
		driver.findElement(By.xpath("html/body/form/div[4]/div/div[1]/div/div[2]/a[2]/img")).click();
		driver.findElement(By.xpath("html/body/form/div[4]/div/div[1]/div/div[2]/a[3]/img")).click();
		driver.findElement(By.xpath("html/body/form/div[4]/div/div[1]/div/div[2]/a[4]/img")).click();
				
		//ArrayList<String> a = new ArrayList<String>();
		//driver.getWindowHandles();
		ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		int cou = a.size();
		System.out.println("Count of :" +cou);
		
		
		/*ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(4));
		driver.findElement(By.xpath("html/body/div[1]/main/div[1]/div[1]/div[1]/div/a")).click();
		*/
		driver.switchTo().window(a.get(1));
		driver.findElement(By.xpath("//*[@id='bottom-module']/div/div/div[2]/a[1]")).click();
		driver.switchTo().frame("create-profile");
		driver.findElement(By.xpath("//*[@id='anchorredirect']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		/*List<WebElement> RdBtn = driver.findElements(By.xpath("//*[@id='dvType']/div/div/div[2]/div/div/div[2]"));
		boolean bValue = false;
		bValue = RdBtn.get(0).isSelected();
		if(bValue==true)
		{
			RdBtn.get(1).click();
		}else
		{
			RdBtn.get(0).click();
			
		}*/
		
		driver.findElement(By.xpath("//*[@id='rblType_0']")).click();
		
		driver.findElement(By.id("lnkContinue")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("txtLoginEmail")).sendKeys("adbced");
		driver.findElement(By.id("txtLoginPassword")).sendKeys("pwd41234");
		driver.findElement(By.id("lnkLoginCand")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.close();
		
	}

}
