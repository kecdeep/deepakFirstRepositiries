package testtwo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility extends LoginClass {

	public static  void takescreenshot(String name){
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(source, new File("D:/Screenshpot/"+name+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("take screenshpt"+e.getMessage());
	}

}
}