//package POM;
//
//import java.time.Duration;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import Utility.Driver;
//import Utility.PerformActions;
//
//public class SchoolProfile {
//    WebDriver driver;
//
//    public SchoolProfile(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//
//    // Example elements (keep all others as you have)
//    @FindBy(xpath = "//span[text()='Masters']")
//    public WebElement Master;
//
//    @FindBy(xpath = "//a[text()=' School Profile Application ']")
//    public WebElement SchoolProfile;
//
//    @FindBy(xpath = "(//i[@class='fa fa-edit'])[1]")
//    public WebElement Edit;
//
//    @FindBy(xpath = "//input[@formcontrolname='email']")
//    public WebElement Email;
//
//    @FindBy(xpath = "//input[@formcontrolname='mobile']")
//    public WebElement Mob;
//
//    @FindBy(xpath = "//button[text()='SUBMIT']")
//    public WebElement SubmitButton;
//
//    @FindBy(xpath = "//button[text()='SUBMIT OTP']")
//    public WebElement SubmitOTP;
//
//    // ... rest of your @FindBy fields ...
//
//    // Actions / Methods
//    public void openNewSchoolRegPage() {
//        driver.get("http://158.220.111.142:10112/hsc-ssc-school-application-login");
//    }
//
//    public void clickEditButton() throws InterruptedException {
//        PerformActions.clickWithJavascript(driver, Edit);
//        Thread.sleep(2000);
//    }
//
//    public void fillSchoolDetails() throws InterruptedException {
//        Email.sendKeys("11111@gmail.com");
//        Thread.sleep(1500);
//        Mob.sendKeys("9999999999");
//        Thread.sleep(1500);
//        PerformActions.clickWithJavascript(driver, SubmitButton);
//        Thread.sleep(15000); // Manually enter OTP
//        PerformActions.clickWithJavascript(driver, SubmitOTP);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//
//    public void fillSansthaDetails() throws InterruptedException {
//        // Same idea — clean and organized logic
//    }
//
//    public void fillOtherDetails() throws InterruptedException {
//        // Same here
//    }
//
//    public void fillTeacherDetails() throws InterruptedException {
//        PerformActions.clickWithJavascript(driver, TDetails);
//        Thread.sleep(2000);
//        PerformActions.clickWithJavascript(driver, NewBtn);
//        LastName.sendKeys("Patil");
//        FirstName.sendKeys("Mahaveer");
//        MiddleName.sendKeys("Shantinath");
//        MobileNo.sendKeys("9876543210");
//    }
//
//    // Add other methods as needed...
//}
