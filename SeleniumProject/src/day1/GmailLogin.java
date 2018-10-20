package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();

		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement email=driver.findElement(By.id("identifierId"));
		
		email.sendKeys("gandesharath@gmail.com");
//		Sleeper.sleepTightInSeconds(5);
//		email.clear();
		
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
//		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.name("password")).sendKeys("123456789");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
	}

}
