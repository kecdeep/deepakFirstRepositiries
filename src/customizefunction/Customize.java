package customizefunction;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Customize {


public static String getTitle(WebDriver driver)
{
 String pagetile=driver.getTitle();
	System.out.println("new update");
	return pagetile;
}

public static boolean isElementPresentCheckBox(WebDriver driver,String xpath){
	
	int s=driver.findElements(By.xpath(xpath)).size();
	if(s==0){
		return false;
	}
	else{
		
		 driver.findElement(By.xpath(xpath)).click();
		return true;
		
	}
}
	public static boolean isElementPresent(WebDriver driver,String xpath){
		
		int s=driver.findElements(By.xpath(xpath)).size();
		if(s==0){
			return false;
		}
		else{
			
			
			return true;
			
		}
}

public static  void takescreenshot(WebDriver driver ,String name){
	try {
		TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(source, new File("D:/Screenshpot/"+name+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("take screenshpt"+e.getMessage());
}
	

}
public static void scrolllBar(WebDriver driver )
{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,400)", "");
}
public static boolean isElementPresentDropDown(WebDriver driver,String xpath,String value){
	
	int s=driver.findElements(By.xpath(xpath)).size();
	if(s==0){
		return false;
	}
	else{
	
		WebElement ele=driver.findElement(By.xpath(xpath));
		List<WebElement> alloption=ele.findElements(By.xpath("//option"));
		
		for(int i=0;i<alloption.size();i++)
		{
			System.out.println(alloption.get(i).getText());
			if(alloption.get(i).getText().equalsIgnoreCase(value))
			{
				alloption.get(i).click();
				
			}
		}
		return true;
		
	}
}

public static void entertext(String xpath, String value, WebDriver driver) {
	driver.findElement(By.xpath(xpath)).sendKeys(value);
	
}

public static boolean isElementPresentRadioButton(WebDriver driver,String xpath){
	
	int s=driver.findElements(By.xpath(xpath)).size();
	if(s==0){
		return false;
	}
	else{
		
		 driver.findElement(By.xpath(xpath)).click();
		return true;
		
	}

}
public static boolean isElementOptionClick(WebDriver driver,String xpath){
	
	int s=driver.findElements(By.xpath(xpath)).size();
	if(s==0){
		return false;
	}
	else{
		
		 driver.findElement(By.xpath(xpath)).click();
		return true;
		
	}

}
public static String isElementAlertAccept(WebDriver driver){
	
	Alert s=driver.switchTo().alert();
	
   
	return 	s.getText();

	

}
}

