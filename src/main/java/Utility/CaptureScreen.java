package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen 
{
	public static WebDriver driver;

	public CaptureScreen(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public void CapsScreen() throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\Desktop\\Capture\\Pic.jpej");
		FileHandler.copy(source, dest);
	}
}
