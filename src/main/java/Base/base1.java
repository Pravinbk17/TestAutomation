package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POM.Login;
import POM.MakerChecker;
import POM.NewUserCreat;
import POM.RoleBase;
import Utility.CaptureScreen;
import Utility.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base1 extends Driver {

    public static Login login;
    public static NewUserCreat NewUser;
    public static MakerChecker SelectMaker;
//    public static SchoolProfile SchoolInfo;
    public static CaptureScreen TakeSnap; 
    public static RoleBase RolePermission;

    public static WebDriver driver;

//    public void CallObject() {
//        login = new Login();
//        NewUser = new NewUserCreat(); 
//        SelectMaker = new MakerChecker();
//        SchoolInfo = new SchoolProfile();
//        TakeSnap = new CaptureScreen();
//        RolePermission = new RoleBase();
//    }
    
    public void CallObject() {
        login = new Login(driver);  // ✅ Pass WebDriver to constructor
        NewUser = new NewUserCreat(driver);
        SelectMaker = new MakerChecker(driver);
//        SchoolInfo = new SchoolProfile(driver);
        TakeSnap = new CaptureScreen(driver);
        RolePermission = new RoleBase(driver);
    }


    @BeforeClass
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();  
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void launchBrowser() {
        driver.get("http://27.107.130.31:24600/");
        CallObject();
    }

    @BeforeMethod
    public void ApplyImplicitwait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest
    public void SOut() throws InterruptedException {
        Thread.sleep(3000);
         driver.quit(); // Optional: closes the browser
    }
}
