package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoExe {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new FirefoxDriver();
	
	String url = "http://store.demoqa.com/";
	driver.get(url);
	String title = driver.getTitle();
	int titleLength = driver.getTitle().length();
	System.out.println("Title of the page is "+ title);
	System.out.println("Length of title is" + titleLength);
	String acturl = driver.getCurrentUrl();
	System.out.println("actual url is "+acturl);
	if(acturl.equals(url))
	{
		System.out.println("Verified and correct page opened");
	}else
	{
		System.out.println(" Verified and wrong page opened");
	}
	String pagesour = driver.getPageSource();
	//System.out.println(pagesour);
	int pagsorlen = driver.getPageSource().length();
	
	System.out.println("page source lenaght is "+pagsorlen);
	
	driver.quit();
	}
}
