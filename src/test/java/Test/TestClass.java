package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.base1;

public class TestClass extends base1
{
//	@Test (priority = 1)
//	public void Login() throws InterruptedException, IOException 
//	{
//	 login.LoginCase();	
//	 login.Negative();
//	 
//	 TakeSnap.CapsScreen();
//	 
//	}
//	@Test (priority = 2)
//	public void RolePermission() throws InterruptedException 
//	{
//		
//		RolePermission.RoleBased();
//	}
//	 
//	@Test(priority = 2)
//	public void NewUser() throws InterruptedException
//	{
//		 NewUser.AddNewUser();
//		 NewUser.Info();
//		 NewUser.UserDetails();
//	}
//	
//	@Test (priority = 3)
//	public void SelectMaker() throws InterruptedException  
//	{
//		SelectMaker.SelectMakers();
//	}
//	
	@Test (priority = 2)
	public void SchoolProfile() throws InterruptedException 
	{
		SchoolInfo.NewSchReg();
		 SchoolInfo.SchoolDetails();
//		 SchoolInfo.Edit();
//		 SchoolInfo.SansthaDetails();
//		 SchoolInfo.OtherDetails();
	}

}
