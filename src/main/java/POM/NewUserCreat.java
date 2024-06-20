package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Driver;

public class NewUserCreat extends Driver
{
	@FindBy (xpath="//span[text()='Admin']") public WebElement AD;
	@FindBy (xpath="//a[contains (@href, 'user')]") public WebElement User;
	@FindBy (xpath="//b[text ()= 'Add New User']") public WebElement AddNewUser;
	
	@FindBy (xpath="//input[@formcontrolname=\"SearchString\"]") public WebElement searchuser;
	
	@FindBy (xpath="//span[text ()='User Type']") public WebElement UT;
	@FindBy (xpath="//span[text ()=' School ']") public WebElement School;
	@FindBy (xpath="//span[text ()='Division']") public WebElement Div;
	@FindBy (xpath="//span[text ()=' KONKAN ']") public WebElement Konkan;
	@FindBy (xpath="//span[text()='SchoolName']") public WebElement SN;
	@FindBy (xpath="//input[@formcontrolname=\"value\"]") public WebElement search;
	@FindBy (xpath="//span[text()=' 2501001-New English School Shivani ']") public WebElement SelectSchool;
	
	@FindBy (xpath="//input[@formcontrolname='emp_name']") public WebElement EmpNm;
	@FindBy (xpath="//input[@formcontrolname='mobile_no']") public WebElement MobileNo;
	@FindBy (xpath="//input[@formcontrolname='email']") public WebElement Email;
	@FindBy (xpath="//span[text()='User Role']") public WebElement UserRole;
	@FindBy (xpath="//span[text()=' TEACHER ']") public WebElement Teacher;
	@FindBy (xpath="//span[text()=' Save ']") public WebElement save;
	@FindBy (xpath="(//button[@type='button'])[5]") public WebElement closeSymbol;
	
	public NewUserCreat() 
	{
		PageFactory.initElements(driver, this);
		
	}
		public void AddNewUser() throws InterruptedException 
	{
		AD.click();
		User.click();
		//searchuser.sendKeys("9326371171");
		AddNewUser.click();
		Thread.sleep(1500);
		
	}
	   public void Info() throws InterruptedException
	{
		UT.click();Thread.sleep(3000);
		School.click();
		Div.click();Thread.sleep(3000);
		Konkan.click();Thread.sleep(3000);
		SN.click(); 
		search.sendKeys("New English School Shivani");
		Thread.sleep(5000);
		Utility.PerformActions.clickWithJavascript(SelectSchool);//UES.click();Thread.sleep(1500);
				
		
	}
	   public void UserDetails() throws InterruptedException
	   {
		   EmpNm.sendKeys("Pravin Budruk");Thread.sleep(3000);
		   MobileNo.sendKeys("9326371171");Thread.sleep(3000);
		   Email.sendKeys("Pravinbk1710@gmail.com");Thread.sleep(2000);
		   UserRole.click();Thread.sleep(1500);
		   Teacher.click();Thread.sleep(1500);
		   Thread.sleep(2000);
//		   JavascriptExecutor js = (JavascriptExecutor) driver;
//		   js.executeScript("arguments[0].click();", save);
		   
		   //Utility.PerformActions.clickWithJavascript(save);
	   		Thread.sleep(5000);
//	   		js.executeScript("arguments[0].click();", closeSymbol);
	   		Utility.PerformActions.clickWithJavascript(closeSymbol);
		    
	   }
	
}
