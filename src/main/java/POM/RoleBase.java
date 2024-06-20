package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Driver;

public class RoleBase extends Driver
{
	@FindBy (xpath="//span[text()='Admin']") public WebElement AD;
	@FindBy (xpath="//a[text()=' Role Based Permission ']") public WebElement Role;
	@FindBy (xpath="//span[text()=' New ']") public WebElement New;
	@FindBy (xpath="//div[@class='mat-select-value ng-tns-c86-13']") public WebElement UserRole;
	@FindBy (xpath="//span[text()=' TEACHER ']") public WebElement Teacher;
	//Permissions X-paths
	@FindBy (xpath="(//input[@value='User'])[1]") public WebElement User;
	@FindBy (xpath="(//input[@value='School Profile Application'])[1]") public WebElement SchProfile;
	@FindBy (xpath="(//input[@value='School Student Application'])[1]") public WebElement SchApp;
	
	
	
	
	@FindBy (xpath="//span[text()=' Save ']") public WebElement Save;
	@FindBy (xpath="//button[text()=' Close ']") public WebElement Close;
	
	public RoleBase() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void RoleBased() throws InterruptedException 
	{
		Utility.PerformActions.clickWithJavascript(AD);
		Utility.PerformActions.clickWithJavascript(Role);Thread.sleep(3000);
		Utility.PerformActions.clickWithJavascript(New);Thread.sleep(3000);
		Utility.PerformActions.clickWithJavascript(UserRole);Thread.sleep(3000);
//		UserRole.sendKeys("TEACHER");
		Utility.PerformActions.clickWithJavascript(Teacher);Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(User);Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(SchProfile);Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(SchApp);
				
		Thread.sleep(3000);
		Utility.PerformActions.clickWithJavascript(Save);Thread.sleep(1500);
		Utility.PerformActions.clickWithJavascript(Close);
		
	}
}
