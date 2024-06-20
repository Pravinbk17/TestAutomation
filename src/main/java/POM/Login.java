package POM;

import static org.testng.Assert.expectThrows;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.Driver;

public class Login extends Driver
{
	@FindBy (xpath="//input[@formcontrolname='LoginId']") public WebElement UN;
	@FindBy (xpath="//input[@formcontrolname='Pass']") public WebElement PWD;
	@FindBy (xpath="//button[text()='Sign In']") public WebElement SignIn;
	@FindBy (xpath="//label[text()='Invalid login credentials or inactive account ']") public WebElement Print;
	
	@FindBy (xpath="//i[@alt='show']") public WebElement Eye;
	
	@FindBy (xpath="//img[@alt='avatar']") public WebElement Profile;
	@FindBy (xpath="//a[text()=' Sign Out ']") public WebElement SignOut;

	
	
	
	public Login() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void LoginCase() throws InterruptedException 
	{
		UN.sendKeys("001");
		PWD.sendKeys("admin");
//		Eye.click();
		Utility.PerformActions.clickWithJavascript(SignIn);
//		SignIn.click();
		Thread.sleep(2000);
		
	}
	public void Negative() throws InterruptedException 
	{
		UN.sendKeys("00");
		PWD.sendKeys("Admin");
		Utility.PerformActions.clickWithJavascript(SignIn);
		//SignIn.click();
		Thread.sleep(2000);
		
		
		WebElement ActualMSG=driver.findElement(By.xpath("//label[text()='Invalid login credentials or inactive account ']"));
		String ExpectedMSG="Invalid login credentials or inactive account";
		boolean assertionResult = false;
		
		try 
		{
            // Assertion
            Assert.assertEquals(ActualMSG.getText(), ExpectedMSG, "Error message not as expected. Test case failed.");
            assertionResult = true;
        }
		catch (AssertionError e) 
		{
            assertionResult = false;
        }

        // Print the assertion result
        if (assertionResult) 
        {
            System.out.println("Invalid login credentials or inactive account");
        } 
        else 
        {
            System.out.println("Assertion failed.");
        }
		
	}
	public void SignOut() throws InterruptedException 
	{
		Utility.PerformActions.clickWithJavascript(Profile);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(SignOut);
	}
	
		
	
	

}
