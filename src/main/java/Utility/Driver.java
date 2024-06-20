package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver 
{	public static WebDriver driver;

	public static void UseDriver() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Automation files\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

		
}
