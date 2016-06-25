package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChkBoxWithValue {

	public static void main(String[] args)
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://toolsqa.com/automation-practice-form/");
	 List<WebElement> oCheckBox = driver.findElements(By.xpath("//*[@id='content']/form/fieldset/div[10]"));
	 	 
	 // This will tell you the number of checkboxes are present
	 
	 int iSize = oCheckBox.size();
	 System.out.println("No of Checkboxs present:" + iSize);
	 
	 
	 // Start the loop from first checkbox to last checkboxe
	 		
	 for(int i=0; i < iSize ; i++ )
	 {
	 
		 // Store the checkbox name to the string variable, using 'Value' attribute
	 
		 String sValue = oCheckBox.get(i).getAttribute("value");
		 System.out.println(" Svalue is " + sValue);
		 
	 
		 // Select the checkbox it the value of the checkbox is same what you are looking for
	 
		 if (sValue.equalsIgnoreCase("toolsqa")){
	 
			 oCheckBox.get(i).click();
	 
			 // This will take the execution out of for loop
	 
			 break;
		 }
	
	}
	}
}


