package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.Driver;

public class Login extends Driver {

    WebDriver driver;

    @FindBy(xpath = "//input[@formcontrolname='LoginId']")
    public WebElement UN;

    @FindBy(xpath = "//input[@formcontrolname='Pass']")
    public WebElement PWD;

    @FindBy(xpath = "//label[text()='Sign In']")
    public WebElement SignIn;

    @FindBy(xpath = "//label[text()='Invalid login credentials or inactive account ']")
    public WebElement Print;

    @FindBy(xpath = "//i[@alt='show']")
    public WebElement Eye;

    @FindBy(xpath = "//img[@alt='avatar']")
    public WebElement Profile;

    @FindBy(xpath = "//a[text()=' Sign Out ']")
    public WebElement SignOut;

    // ✅ Proper constructor to initialize PageFactory
    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // ✅ This initializes all @FindBy elements
    }

    public void LoginCase() throws InterruptedException {
        UN.sendKeys("001");
        Thread.sleep(2000);
        PWD.sendKeys("Pass@123");
        Utility.PerformActions.clickWithJavascript(driver, SignIn);  // Optional
//        SignIn.click();
        Thread.sleep(2000);
    }

    public void Negative() throws InterruptedException {
        UN.sendKeys("001");
        PWD.sendKeys("Pass@123");Thread.sleep(5000);
        Utility.PerformActions.clickWithJavascript(driver, SignIn);
        

        WebElement ActualMSG = driver.findElement(By.xpath("//label[text()='Invalid login credentials or inactive account ']"));
        String ExpectedMSG = "Invalid login credentials or inactive account";

        try {
            Assert.assertEquals(ActualMSG.getText(), ExpectedMSG);
            System.out.println("Invalid login credentials or inactive account");
        } catch (AssertionError e) {
            System.out.println("Assertion failed.");
        }
    }

    public void SignOut() throws InterruptedException {
        Utility.PerformActions.clickWithJavascript(driver, Profile);
        Thread.sleep(2000);
        Utility.PerformActions.clickWithJavascript(driver, SignOut);
    }
}
