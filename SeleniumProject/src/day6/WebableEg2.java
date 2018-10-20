package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class WebableEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		
		
		driver.findElement(By.linkText("PIM")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.linkText("Employee List")).click();
		Sleeper.sleepTightInSeconds(3);
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		
		System.out.println(rows.size());
		
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			Sleeper.sleepTightInSeconds(2);
//			cols.get(0).findElement(By.name("chkSelectRow[]")).click();
			
			String Eid=cols.get(1).getText();
			System.out.println(Eid);
			
			
			if (Eid.equals("1018368919"))
			{
				cols.get(0).click();
				driver.findElement(By.id("btnDelete")).click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
			}
		}

	}

}
