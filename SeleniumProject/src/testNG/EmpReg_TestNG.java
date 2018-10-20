package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpReg_TestNG extends OrgLib_TestNG
{
	@Test(dataProvider="data")
	public void Org_Empreg(String f, String l,String Eid)
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(Eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(actval, expval, "Employee Registration Failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] x=new Object[3][3];
		
		x[0][0]="Manasa1";
		x[0][1]="Reddy";
		x[0][2]="MR9874";
		
		x[1][0]="Manasa2";
		x[1][1]="Reddy";
		x[1][2]="MR9258";
		
		
		x[2][0]="Manasa3";
		x[2][1]="Reddy";
		x[2][2]="MR4587";
		
		return x;
	}

}
