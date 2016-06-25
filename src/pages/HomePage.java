package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver obj;
	By uid=By.name("Email");
	By next=By.id("next");
	public HomePage(WebDriver x)
	{
		this.obj=x;
	}
	public void uidfill(String x)
	{
		obj.findElement(uid).sendKeys(x);
	}
	public void clicknext()
	{
		obj.findElement(next).click();
	}
}
