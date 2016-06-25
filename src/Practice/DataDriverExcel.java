package Practice;
import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDriverExcel {
	public static void main(String[] args) throws InterruptedException, BiffException, IOException, RowsExceededException, WriteException {
		File f = new File("C:\\Program Files\\DataDrivenTest.xls");	
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh1 = wb.getSheet(0);
		int nor = sh1.getRows();

		WritableWorkbook wwb = Workbook.createWorkbook(f,wb);
		WritableSheet sh2 = wwb.getSheet(0);

		for(int i=1;i<nor;i++)
		{
			WebDriver obj= new FirefoxDriver();
			obj.get("https://accounts.google.com");
			Thread.sleep(5000);
			obj.manage().window().maximize();
			String uid = sh1.getCell(0, i).getContents();
			String ucritria = sh1.getCell(1, i).getContents();
			String pwd = sh1.getCell(2, i).getContents();
			String pwdcritria = sh1.getCell(3, i).getContents();

			obj.findElement(By.name("Email")).sendKeys(uid);
			Thread.sleep(3000);
			obj.findElement(By.id("next")).click();
			Thread.sleep(3000);
			if(ucritria.equals("valid") && obj.findElement(By.id("Passwd")).isDisplayed())
			{
				System.out.println("Valid User Id Test Passed..");
				obj.findElement(By.id("Passwd")).sendKeys(pwd);
				Thread.sleep(3000);
				obj.findElement(By.id("signIn")).click();
				Thread.sleep(20000);
				if(pwdcritria.equals("valid") && obj.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")).isDisplayed())
				{
					Label l = new Label(4,i,"Test Passed");
					sh2.addCell(l);

				}
				else if(pwdcritria.equals("invalid") && obj.findElement(By.id("errormsg_0_Passwd")).isDisplayed())
				{
					Label l = new Label(4,i,"Invalid Password Test Passed..");
					sh2.addCell(l);
				}
				else
				{
					Label l = new Label(4,i,"Password Test Failed..");
					sh2.addCell(l);
				}
			}	
			else if(ucritria.equals("invalid") && obj.findElement(By.id("errormsg_0_Email")).isDisplayed())
			{
				Label l = new Label(4,i,"Invalid User Id Test Passed..");
				sh2.addCell(l);
			}
			else
			{
				Label l = new Label(4,i,"User Id Test Failed..");
				sh2.addCell(l);
			}
			obj.close();
		}
		wwb.write();
		wwb.close();
		wb.close();
	}

}