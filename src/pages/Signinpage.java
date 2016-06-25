package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signinpage {

	WebDriver obj;
	By pwd=By.name("Passwd");
	By signin=By.id("signIn");
	public Signinpage(WebDriver x)
	{
		this.obj=x;
	}
	public void pwdfill(String x)
	{
		obj.findElement(pwd).sendKeys(x);
	}
	public void clicksignin()
	{
		obj.findElement(signin).click();
	}
}
