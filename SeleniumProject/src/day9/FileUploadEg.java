package day9;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FileUploadEg {

	public static void main(String[] args) throws IOException
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		Sleeper.sleepTightInSeconds(3);
		
		driver.findElement(By.id("photofile")).click();
		
//		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\FileUpload1.exe");
		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\FileUploadEg2.exe");
	}

}
