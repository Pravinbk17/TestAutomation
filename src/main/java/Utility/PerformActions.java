package Utility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PerformActions extends Driver
{
	public static void clickWithJavascript(WebElement e)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(e));
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", e);	
		
	}
	
	public static void ExpWait() 
	{
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(null);
	}


}
