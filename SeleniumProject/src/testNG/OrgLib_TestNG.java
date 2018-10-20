package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class OrgLib_TestNG 
{
	public static WebDriver driver;
	public static String expval,actval;
	public static String url="http://orangehrm.qedgetech.com";
	public static String u="Admin",p="Admin";
	public static String f="Sindhu",l="Reddy",Eid="SR7869";
	public static String ename=f+" "+l,uname=f+l+"123456789",pswd=f+l+"123456789",cpswd=f+l+"123456789";
	@BeforeSuite
	public void Org_Launch()
	{
		expval="LOGIN";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		Assert.assertEquals(actval, expval, "Launch Failed");
	}
	
	@BeforeTest
	public void Org_Login()
	{
		expval="welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		
		actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		
		Assert.assertEquals(actval, expval, "Login Failed");
	}
	
	@AfterTest
	public void Org_Logout() throws InterruptedException
	{
		expval="LOGIN";
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.partialLinkText("Logout")).click();
		
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval, "Logout Failed");
	}
	
	@AfterSuite
	public void Org_Close()
	{
		driver.close();
	}

}
