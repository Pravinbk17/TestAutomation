package POM;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Driver;

public class ForgetPass extends Driver
{
	@FindBy (xpath="//a[text()='Forgot your password?']") public WebElement FPass;
	@FindBy (xpath="//input[@formcontrolname='login_id']") public WebElement LoginEn;
	@FindBy (xpath="//button[text()='Send OTP Request']") public WebElement OTPRequest;
	@FindBy (xpath="//button[text()='Verify OTP']") public WebElement VerifyOtp;
	@FindBy (xpath="//label[text()='Back To Login']") public WebElement BackLogin;
	
	
	
	
	public ForgetPass() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void Forget() throws InterruptedException 
	{
		Utility.PerformActions.clickWithJavascript(driver, FPass);
		LoginEn.sendKeys("S2501001_1");Thread.sleep(3000);
		Utility.PerformActions.clickWithJavascript(driver, OTPRequest);Thread.sleep(1500);// Enter OTP Manually(we can't automate Otp functionality)
		Utility.PerformActions.clickWithJavascript(driver, VerifyOtp);
		Utility.PerformActions.clickWithJavascript(driver, BackLogin);
		
	}
}
