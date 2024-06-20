package Base;
import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import POM.Login;
import POM.MakerChecker;
import POM.NewUserCreat;
import POM.RoleBase;
import POM.SchoolProfile;
import Utility.CaptureScreen;
import Utility.Driver;
public class base1 extends Driver
{
	
	public static Login login;
	public static NewUserCreat NewUser;
	public static MakerChecker SelectMaker;
	public static SchoolProfile SchoolInfo;
	public static CaptureScreen TakeSnap; 
	public static RoleBase RolePermission;
	
	
	public void CallObject() 
	{
		login= new Login();
		
		NewUser= new NewUserCreat(); 
		
		SelectMaker= new MakerChecker();
		
		SchoolInfo= new SchoolProfile();
		
		TakeSnap= new CaptureScreen();
		
		RolePermission= new RoleBase();

	}
	
	@BeforeTest
	public void launchBrowser() 
	{
		Utility.Driver.UseDriver();
//		driver.get("http://158.220.111.142:10112/");
		CallObject();
	}
	
	@BeforeMethod
	public void ApplyImplicitwait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	}
	@AfterTest
	public void SOut() throws InterruptedException 
	{
//		login.SignOut();
		Thread.sleep(3000);
//		driver.close();
	}
//	public void ApplyExplicitWait()
//	{
//		
//	}
	

}
