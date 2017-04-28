package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	
public static void main(String args[]) throws IOException
{
	//System.setProperty("weddriver.chrome.driver", "D:\\Selenium3\\chromedriver_win32\\ChromeDriver.exe");
		System.setProperty("weddriver.chrome.driver", "D:\\Selenium3\\geckoriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=RTL3WMv6CKjv8weLybagCw&gws_rd=ssl");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("D:\\Screenshpot\\face.png"));
		
	}
}
