package POM;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Driver;

public class SchoolProfile extends Driver
{
	@FindBy (xpath="//span[text()='Masters']") public WebElement Master;
	@FindBy (xpath="//a[text()=' School Profile Application ']") public WebElement SchoolProfile;
	@FindBy (xpath="//span[text()=' New ']") public WebElement NewButton;
	@FindBy (xpath="(//i[@class='fa fa-edit'])[1]") public WebElement Edit;
	
	//School Details X-Paths
	
	@FindBy (xpath="//input[@formcontrolname='email']") public WebElement Email;//New Registration
	@FindBy (xpath="//input[@formcontrolname='mobile']") public WebElement Mob;//New Registration
	@FindBy (xpath="//button[text()='SUBMIT']") public WebElement SubmitButton;//New Registrations
	
	//Enter OTP Manually 
	@FindBy (xpath="//button[text()='SUBMIT OTP']") public WebElement SubmitOTP;
	
	@FindBy (xpath="//input[@formcontrolname='upi']") public WebElement UpiEnter;
	@FindBy (xpath="//button[text()='PAY']") public WebElement PayBtn;
	
	@FindBy (xpath="//input[@formcontrolname='full_name']") public WebElement FullNme;
	@FindBy (xpath="//input[@formcontrolname='short_name']") public WebElement ShortNme;
	
	@FindBy (xpath="//mat-select[@formcontrolname='is_technical_science']") public WebElement IsTechnical;
	@FindBy (xpath="(//span[text()='YES'])[1]") public WebElement YesSch1;
//	@FindBy (xpath="//span[text()='NO']") public WebElement No;// If these field is no then enter UDISE Number 
	@FindBy (xpath="//input[@formcontrolname='udise_no']") public WebElement UdiseNo;
	@FindBy (xpath="//mat-select[@formcontrolname='msbsvet_affiliated']") public WebElement MSBSVET;
	@FindBy (xpath="(//span[text()='YES'])[2]") public WebElement YesSch2;
	@FindBy (xpath="//input[@formcontrolname='address']") public WebElement SchAdd;
	@FindBy (xpath="//input[@formcontrolname='address_line1']") public WebElement AddLine1;
	@FindBy (xpath="//input[@formcontrolname='address_line2']") public WebElement AddLine2;
	@FindBy (xpath="//input[@formcontrolname='address_line3']") public WebElement AddLine3;
	@FindBy (xpath="//mat-select[@formcontrolname='district']") public WebElement District;
	@FindBy (xpath="//span[text()=' PUNE ']") public WebElement SelectD;
	@FindBy (xpath="//mat-select[@formcontrolname='taluka']") public WebElement Taluka;
	@FindBy (xpath="//span[text()=' DAUND ']") public WebElement SelectT;
	@FindBy (xpath="//input[@formcontrolname='revenue_circle']") public WebElement RevCircle;
	@FindBy (xpath="//input[@formcontrolname='pincode']") public WebElement PinCode;
	@FindBy (xpath="//input[@formcontrolname='march_examcenter_no']") public WebElement MECenterNo;
	@FindBy (xpath="//input[@formcontrolname='july_exam_center_no']") public WebElement JECenterNo;
	@FindBy (xpath="//mat-select[@formcontrolname='management_category']") public WebElement MCategory;
	@FindBy (xpath="//span[text()='Government']") public WebElement Goverment;
	@FindBy (xpath="//input[@formcontrolname='sanctioned_intake']") public WebElement San;
	@FindBy (xpath="//span[text()=' Save ']") public WebElement SaveButton;
//	@FindBy (xpath="//span[text()=' Update & Next ']") public WebElement Update;//if we want to update school that time uncomment this line..!
	@FindBy (xpath="//span[text()=' List ']") public WebElement ListButton;
	
	
	
	
	//Sanstha Details X-Paths
	
//	@FindBy (xpath="//div[text()='Sanstha Details']") public WebElement Sanstha;
	@FindBy (xpath="//input[@formcontrolname='name']") public WebElement SansthaName;
	@FindBy (xpath="//input[@formcontrolname='address']") public WebElement SanAddress;
	@FindBy (xpath="//input[@formcontrolname='address_line1']") public WebElement SanAddress1;
	@FindBy (xpath="//input[@formcontrolname='address_line2']") public WebElement SanAddress2;
	@FindBy (xpath="//input[@formcontrolname='address_line3']") public WebElement SanAddress3;
	@FindBy (xpath="//span[text()='District']") public WebElement SDistrict;
	@FindBy (xpath="//span[text()=' PUNE ']") public WebElement SSelectD;
	@FindBy (xpath="//span[text()='Taluka']") public WebElement STaluka;
	@FindBy (xpath="//span[text()=' JUNNER ']") public WebElement SSelectT;
	@FindBy (xpath="//input[@formcontrolname='pincode']") public WebElement SanPinCd;
	@FindBy (xpath="//input[@formcontrolname='chairman_name']") public WebElement ChmnNm;
	@FindBy (xpath="//input[@formcontrolname='chairman_mobile']") public WebElement ChmnMob;
	@FindBy (xpath="//input[@formcontrolname='chairman_email']") public WebElement ChmnEmail;
	@FindBy (xpath="//input[@formcontrolname='secretary_name']") public WebElement SectNm;
	@FindBy (xpath="//input[@formcontrolname='secretary_mobile']") public WebElement SectMob;
	@FindBy (xpath="//input[@formcontrolname='secretary_email']") public WebElement SectEmail;
	@FindBy (xpath="//span[text()=' Save ']") public WebElement SansthaSave;
	
	
	//Other Details X-Paths
	
//	@FindBy (xpath="//div[text()='Other Details']") public WebElement OtherDetail;
	@FindBy (xpath="//span[text()='Medium']") public WebElement Medium;
	@FindBy (xpath="//span[text()=' 1 - ENGLISH ']") public WebElement English;
	@FindBy (xpath="//span[text()=' 2 - MARATHI ']") public WebElement Marathi;
	@FindBy (xpath="//mat-select[@formcontrolname='grant_type']") public WebElement GType;
	@FindBy (xpath="//span[text()='Total Granted']") public WebElement TGranted;
	@FindBy (xpath="//input[@formcontrolname='year_of_first_apllication']") public WebElement YearOfApl;
	@FindBy (xpath="//input[@formcontrolname='telephone_no']") public WebElement TelNo;
	@FindBy (xpath="//input[@formcontrolname='head_master_name']") public WebElement HeadMstNm;
//	@FindBy (xpath="//input[@formcontrolname='HeadMstMob']") public WebElement HeadMstMob;
//	@FindBy (xpath="//input[@formcontrolname='HeadMstEmail']") public WebElement HeadMstEmail;// This both are prepopulate
	@FindBy (xpath="//mat-select[@formcontrolname='school_type']") public WebElement SchType;
	@FindBy (xpath="//span[text()='Type 1']") public WebElement Type1;
	@FindBy (xpath="//input[@formcontrolname='divisional_board']") public WebElement DivBoard;
	@FindBy (xpath="//mat-select[@formcontrolname='is_custodian_office']") public WebElement CustOffice;
	@FindBy (xpath="(//span[text()='Yes'])[1]") public WebElement Yes1;
	@FindBy (xpath="//span[text()='ShReceive Shikshan Sankraman Magazine ?']") public WebElement ShReceive;
	@FindBy (xpath="(//span[text()='Yes'])[2]") public WebElement Yes2;
	@FindBy (xpath="//input[@formcontrolname='BldgDetails']") public WebElement BldgDetails;
	@FindBy (xpath="//span[text()='Compound around School ?']") public WebElement CompSch;
	@FindBy (xpath="(//span[text()='Yes'])[3]") public WebElement Yes3;
	@FindBy (xpath="//span[text()='Ramp']") public WebElement Ramp;
	@FindBy (xpath="(//span[text()='Yes'])[4]") public WebElement Yes4;
	@FindBy (xpath="//span[text()='Drinking Water Facility ?']") public WebElement DrinkWater;
	@FindBy (xpath="(//span[text()='Yes'])[5]") public WebElement Yes5;
	@FindBy (xpath="//mat-select[@formcontrolname='SeparateWashroom']") public WebElement SeprateWashroom;
	@FindBy (xpath="(//span[text()='Yes'])[6]") public WebElement Yes6;
	@FindBy (xpath="//input[@formcontrolname='NumBoysWashrooms']") public WebElement NumBoysWashrooms;
	@FindBy (xpath="//input[@formcontrolname='NumGirlsWashrooms']") public WebElement NumGirlsWashrooms;
	@FindBy (xpath="//span[text()='Is Electrical Supply Available ?']") public WebElement EleSupply;
	@FindBy (xpath="(//span[text()='Yes'])[7]") public WebElement Yes7;
	@FindBy (xpath="//span[text()='Alternate arrangements in case of powerfailure']") public WebElement AltArrenge;
	@FindBy (xpath="(//span[text()='Yes'])[8]") public WebElement Yes8;
	@FindBy (xpath="//span[text()='Is Fire Extinguisher available ?']") public WebElement FireAvailable;
	@FindBy (xpath="(//span[text()='Yes'])[9]") public WebElement Yes9;
	@FindBy (xpath="//span[text()='Are Fans and Lights available in each classroom ?']") public WebElement FansLights;
	@FindBy (xpath="(//span[text()='Yes'])[10]") public WebElement Yes10;
	@FindBy (xpath="//input[@formcontrolname='NumBenchesClassrooms']") public WebElement NumBench;
	@FindBy (xpath="//span[text()='Computer Lab']") public WebElement CompLab;
	@FindBy (xpath="(//span[text()='Yes'])[11]") public WebElement Yes11;
	@FindBy (xpath="//input[@formcontrolname='NumComputers']") public WebElement NumComp;
//	@FindBy (xpath="//span[text()='Number Of Computers']") public WebElement Ye11;//one change is here list of camera path add here
	@FindBy (xpath="//input[@formcontrolname='NumCameras']") public WebElement NumCamera;
	@FindBy (xpath="//input[@formcontrolname='TotalDivisions']") public WebElement TotalDiv;
	@FindBy (xpath="//input[@formcontrolname='TotalAidedDivisions']") public WebElement AidedDiv;
	@FindBy (xpath="//input[@formcontrolname='CapacityOfEachSection']") public WebElement CapacityDiv;
	@FindBy (xpath="//input[@formcontrolname='AbilityOfEachSection']") public WebElement AbilityDiv;
	@FindBy (xpath="//input[@formcontrolname='TotSelfFinDiv']") public WebElement TotalFinDiv;
	@FindBy (xpath="//input[@formcontrolname='TotPerUnaidDiv']") public WebElement TotalPerUnaidDiv;
	@FindBy (xpath="//input[@formcontrolname='TotUnaidDiv']") public WebElement TotalUnaidDiv;
	@FindBy (xpath="//input[@formcontrolname='TotSanctProfs']") public WebElement TotalSanProfs;
	@FindBy (xpath="//input[@formcontrolname='NumOfProfs']") public WebElement NumOfProfs;
//	@FindBy (xpath="(//span[text()='Yes'])[11]") public WebElement Yes11;//Add path other details save button
	
	
	//Teacher Details X-Paths
	
	@FindBy (xpath="//div[text()='Teacher Details']") public WebElement TDetails;
	@FindBy (xpath="//span[text()=' New ']") public WebElement NewBtn;
	@FindBy (xpath="//input[@formcontrolname='last_name']") public WebElement LastName;
	@FindBy (xpath="//input[@formcontrolname='first_name']") public WebElement FirstName;
	@FindBy (xpath="//input[@formcontrolname='middle_name']") public WebElement MiddleName;
	@FindBy (xpath="//input[@formcontrolname='mobile_no']") public WebElement MobileNo;
	@FindBy (xpath="//input[@formcontrolname='academic_qualification']") public WebElement AcQua;
	@FindBy (xpath="//input[@formcontrolname='professional_qualification']") public WebElement ProfQua;
	@FindBy (xpath="//input[@formcontrolname='dob']") public WebElement DOB;
	@FindBy (xpath="//input[@formcontrolname='date_of_retirement']") public WebElement DOR;
	@FindBy (xpath="//mat-select[@formcontrolname='current_subject_code']") public WebElement CurrentSub;
	@FindBy (xpath="//span[text()=' English ']") public WebElement SelectEng;
	@FindBy (xpath="(//mat-select[@formcontrolname='paper_code'])[1]") public WebElement PaperCode1;
	@FindBy (xpath="//span[text()=' ENGLISH ']") public WebElement CodeEng;
	@FindBy (xpath="(//input[@formcontrolname='teaching_experience'])[1]") public WebElement TechExp1;
	@FindBy (xpath="//input[@formcontrolname='bank_name']") public WebElement BankName;
	@FindBy (xpath="//input[@formcontrolname='ifsc_code']") public WebElement IFSC;
	@FindBy (xpath="//input[@formcontrolname='account_number']") public WebElement AccNumber;
	@FindBy (xpath="//input[@formcontrolname='pan']") public WebElement PanNumber;
	@FindBy (xpath="//input[@formcontrolname='aadhar_number']") public WebElement AdhaarNumber;
	@FindBy (xpath="//mat-select[@formcontrolname='appointment_type']") public WebElement AppType;
	@FindBy (xpath="//span[text()=' Permanent ']") public WebElement Permanent;
	@FindBy (xpath="//mat-select[@formcontrolname='teacher_status']") public WebElement TeacherStatus;
	@FindBy (xpath="//span[text()=' Active ']") public WebElement Active;
	@FindBy (xpath="//input[@formcontrolname='exam_turn']") public WebElement ExamTurn;
	@FindBy (xpath="//input[@formcontrolname='moderate_turn']") public WebElement ModTurn;
	@FindBy (xpath="//input[@formcontrolname='cheap_moderate_turn']") public WebElement CheapModTurn;
	@FindBy (xpath="//mat-select[@formcontrolname='subject_code']") public WebElement SubjectCode;
	@FindBy (xpath="///span[text()=' Hindi-Bengali ']") public WebElement HindiBen;
	@FindBy (xpath="(//mat-select[@formcontrolname='paper_code'])[2]") public WebElement PaperCode2;
	@FindBy (xpath="//span[text()=' HINDI ']") public WebElement Hindi;
	@FindBy (xpath="(//input[@formcontrolname='teaching_experience'])[2]") public WebElement TechExp2;
	@FindBy (xpath="(//button[@type='button'])[8]") public WebElement Symbal;
//	@FindBy (xpath="//span[text()=' Save ']") public WebElement SaveBtn;//save
//	@FindBy (xpath="//span[text()=' Back ']") public WebElement BackBtn;//Back
	
	
	
	public SchoolProfile() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void Edit() throws InterruptedException //If u want create new school then comment this method
	{
		Utility.PerformActions.clickWithJavascript(Edit);
		Thread.sleep(2000);
	}
	
	public void NewSchReg() 
	{
		driver.get("http://158.220.111.142:10112/hsc-ssc-school-application-login");
	}
	public void SchoolDetails() throws InterruptedException 
	{
//		Utility.PerformActions.clickWithJavascript(Master);
//		Thread.sleep(3000);
//		Utility.PerformActions.clickWithJavascript(SchoolProfile);
//		Thread.sleep(3000);
		Email.sendKeys("11111@gmail.com");Thread.sleep(1500);
		Mob.sendKeys("9999999999");Thread.sleep(1500);
		Utility.PerformActions.clickWithJavascript(SubmitButton);Thread.sleep(15000);// Enter OTP Manually
		Utility.PerformActions.clickWithJavascript(SubmitOTP);
//		Utility.PerformActions.clickWithJavascript(PayBtn);
		
		
//		Utility.PerformActions.clickWithJavascript(NewButton);
//		FullNme.sendKeys("New English School");
//		ShortNme.sendKeys("NES");
//		BoardIdxNo.sendKeys("1234567");
//		UdiseNo.sendKeys("12345678900");
//		
//		SchAdd.sendKeys("VishramBag Sangli");
//		AddLine1.sendKeys("VishramBag Sangli");
//		AddLine2.sendKeys("VishramBag Sangli");
//		AddLine3.sendKeys("VishramBag Sangli");
//		Utility.PerformActions.clickWithJavascript(District);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Utility.PerformActions.clickWithJavascript(SelectD);Thread.sleep(2000);
//		Utility.PerformActions.clickWithJavascript(Taluka);
//		Thread.sleep(2000);
//		Utility.PerformActions.clickWithJavascript(SelectT);
//		PinCode.sendKeys("371171");
//		Thread.sleep(2000);
//		MECenterNo.sendKeys("1111");
//		MECenterNm.sendKeys("Sangli");
//		JECenterNo.sendKeys("1111");
//		JECenterNm.sendKeys("Sangli");
//		Utility.PerformActions.clickWithJavascript(MCategory);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Utility.PerformActions.clickWithJavascript(Goverment);
//		San.sendKeys("ABCD");
//		PriCand.sendKeys("ABCD");
//		Utility.PerformActions.clickWithJavascript(SaveButton);
//		Utility.PerformActions.clickWithJavascript(ListButton);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	public void SansthaDetails() throws InterruptedException 
	{
//		Utility.PerformActions.clickWithJavascript(Sanstha);
		SansthaName.sendKeys("Rayat Shikshan Sanstha");Thread.sleep(2000);
		SanAddress.sendKeys("Satara");
		SanAddress1.sendKeys("Satara");
		SanAddress2.sendKeys("Satara");
		SanAddress3.sendKeys("Satara");
		Utility.PerformActions.clickWithJavascript(SDistrict);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Utility.PerformActions.clickWithJavascript(SSelectD);Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(STaluka);Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(SSelectT);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		SanPinCd.sendKeys("151515");
		ChmnNm.sendKeys("Anil Bhaurao Patil");
		ChmnMob.sendKeys("9876543210");
		ChmnEmail.sendKeys("patilanil1234@gmail.com");
		SectNm.sendKeys("Subhash Mahaveer Patil");
		SectMob.sendKeys("9876543210");
		SectEmail.sendKeys("patilsubhash1234@gmail.com");
//		Utility.PerformActions.clickWithJavascript(SansthaSave);//If u want create new school then Uncomment this method
		
	}
	
	public void OtherDetails() throws InterruptedException 
	{
//		Utility.PerformActions.clickWithJavascript(OtherDetail);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(Medium);
		Utility.PerformActions.clickWithJavascript(English);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(GType);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(TGranted);
		YearOfApl.sendKeys("2011");
		TelNo.sendKeys("0234235357");
		HeadMstNm.sendKeys("Shantinath Patil");
//		HeadMstMob.sendKeys("9764668485");
//		HeadMstEmail.sendKeys("patilshantinath2121@gmail.com");
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(SchType);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(Type1);
		DivBoard.sendKeys("000");//no validation added
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(CustOffice);
		Utility.PerformActions.clickWithJavascript(Yes1);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(ShReceive);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(Yes2);
		BldgDetails.sendKeys("000");//no validation added
		Utility.PerformActions.clickWithJavascript(CompSch);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(Yes3);
		Utility.PerformActions.clickWithJavascript(Ramp);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(Yes4);
		Utility.PerformActions.clickWithJavascript(DrinkWater);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(Yes5);
		Utility.PerformActions.clickWithJavascript(SeprateWashroom);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(Yes6);
		Thread.sleep(2000);
		NumBoysWashrooms.sendKeys("10");
		NumGirlsWashrooms.sendKeys("10");
		Utility.PerformActions.clickWithJavascript(EleSupply);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(Yes7);
		Utility.PerformActions.clickWithJavascript(AltArrenge);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(Yes8);
		Utility.PerformActions.clickWithJavascript(FireAvailable);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(Yes9);
		Utility.PerformActions.clickWithJavascript(FansLights);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(Yes10);
		NumBench.sendKeys("30");
		Utility.PerformActions.clickWithJavascript(CompLab);
		Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(Yes11);
		NumComp.sendKeys("48");
		Thread.sleep(2000);
		NumCamera.sendKeys("25");
		TotalDiv.sendKeys("10");
		AidedDiv.sendKeys("10");
		CapacityDiv.sendKeys("100");
		AbilityDiv.sendKeys("11");
		TotalFinDiv.sendKeys("7");
		TotalPerUnaidDiv.sendKeys("15");
		TotalUnaidDiv.sendKeys("17");
		TotalSanProfs.sendKeys("24");
		NumOfProfs.sendKeys("24");
		//save & update path is remaining(find those buttons path and write here)
				
	}
	public void TeacherDetails() throws InterruptedException 
	{
		Utility.PerformActions.clickWithJavascript(TDetails);Thread.sleep(2000);
		Utility.PerformActions.clickWithJavascript(NewBtn);
		LastName.sendKeys("Patil");
		FirstName.sendKeys("Mahaveer");
		MiddleName.sendKeys("Shantinath");
		MobileNo.sendKeys("9876543210");
		
		
	}
	
}
