package pl.lait.podsumowanie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {

	static WebDriver driver;
	
	public static WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver", "d:\\tester\\chromedriver_win32\\chromedriver.exe");
    	
		driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		
		return driver;
		}
	
	public static void endTest() {
		driver.quit();
		driver = null;
		}
	
	/**
	 * Metoda  wstrzymuje wykonanie programu na X sekund
	 * @param seconds
	 */
			
	public static void sleep(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	
}
