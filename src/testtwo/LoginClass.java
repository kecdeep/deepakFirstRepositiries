package testtwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import customizefunction.Customize;

public class LoginClass {
	
public static WebDriver driver;
@Test()

public void urload() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver", "D:\\Selenium3\\geckodriver.exe");
	 driver =new FirefoxDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	Customize.isElementOptionClick(driver, "//*[contains(@name,'proceed')]");
	//Customize.entertext("//*[@id='email']", "deepak","xpath",driver);
	System.out.println(Customize.getTitle(driver));
	System.out.println(Customize.isElementAlertAccept(driver));
	Customize.isElementAlertAccept(driver);
	
	//Customize.entertext("//*[contains(@name,'firstname')]", "deepak", driver);
	
	//Customize.entertext("//*[contains(@name,'lastname')]", "rai", driver);
	
	//Customize.isElementPresentRadioButton(driver, "//*[@id='sex-0']");
	
	//Customize.isElementPresentRadioButton(driver, "//*[@id='exp-4']");
	
	//Customize.isElementPresentCheckBox(driver, "//*[@id='profession-1']");
	//Customize.scrolllBar(driver);
	 
	//Customize.isElementPresentCheckBox(driver, "//*[@id='tool-2']");
	//Customize.isElementPresentDropDown(driver, "//*[@id='continents']","North America");
	
	//Thread.sleep(800);
	//Assert.assertEquals(Customize.isElementPresent(driver, "//*[@id='u_0_5']"), true);
	//Utility.takescreenshot(driver,"facebookone");
}

@AfterMethod
public void test(ITestResult result)
{
	//if(ITestResult.FAILURE==result.getStatus()){
	Utility.takescreenshot("facebook");
		//System.out.println("Fail----"+result.getName());
	//}

	
	driver.quit();
	
}
}

