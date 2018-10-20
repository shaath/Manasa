package day7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiplewindowhandlingEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
//		String gmail=driver.getWindowHandle();
//		System.out.println(gmail);
		
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String Wid=it.next();
			System.out.println(Wid);
			
			driver.switchTo().window(Wid);
			
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			} 
			catch (Exception e)
			{
				System.out.println("The expected link not avaialble in this window");
			}
			
		}
		

	}

}
