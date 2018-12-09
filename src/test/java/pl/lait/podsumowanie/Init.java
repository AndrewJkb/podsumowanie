package pl.lait.podsumowanie;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;

public class Init {

	static WebDriver driver;
	
	public static WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver", "d:\\tester\\chromedriver_win32\\chromedriver.exe");
    	
		driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		
		return driver;
		
		}
	
	public static void printScr(WebDriver driver) {
		//robienie screenów
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Long milis = timestamp.getTime();

		WebDriver driver_tmp = new Augmenter().augment(driver);
		File srcFile = ((TakesScreenshot)driver_tmp).getScreenshotAs(OutputType.FILE);

		try {
		FileUtils.copyFile(srcFile, new File("target/screenshot-"+milis+".png"));
		} catch (IOException e) {
		e.printStackTrace();
		}
		}
	
	public static void printScr(WebDriver driver, String folderName,String testName) {
		//robienie screenów
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Long milis = timestamp.getTime();

		WebDriver driver_tmp = new Augmenter().augment(driver);
		File srcFile = ((TakesScreenshot)driver_tmp).getScreenshotAs(OutputType.FILE);

		try {
		FileUtils.copyFile(srcFile, new File("target/" + folderName + "/" + testName + "-" + "screenshot-" + milis +".png"));
		} catch (IOException e) {
		e.printStackTrace();
		}
		}
	
	
}
