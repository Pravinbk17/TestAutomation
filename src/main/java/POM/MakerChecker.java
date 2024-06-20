package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Driver;

public class MakerChecker extends Driver
{
	//private WebDriverWait wait;
	
	@FindBy (xpath="//span[text()=' Admin ']") public WebElement AD;
	@FindBy (xpath="//a[text()=' Maker & Checker ']") public WebElement MakerChecker;
	@FindBy (xpath="(//input[@type='checkbox'])[2]") public WebElement SelectMaker;
	@FindBy (xpath="//span[text()=' Save ']") public WebElement save;
	@FindBy (xpath="//button[text()=' Close ']") public WebElement close;
	
	public MakerChecker() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	 public void SelectMakers() throws InterruptedException 
	 {
		 AD.click();
		 MakerChecker.click();
		 Thread.sleep(5000);	
		
		 Utility.PerformActions.clickWithJavascript(SelectMaker);
		 
//		 if (!(SelectMaker.isSelected()))
//		 {  			 		 
//			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		        wait.until(ExpectedConditions.elementToBeClickable(SelectMaker)).click();
//		 }
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].click();", save);
		 Utility.PerformActions.clickWithJavascript(save);
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 Thread.sleep(5000);
		 close.click();
//		 public MakerChecker () //constructor
//		 {
//			 Wait = new WebDriverWait(driver, 10); 
//			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(SelectMaker)).click();
//		 }
	 }
	
}
