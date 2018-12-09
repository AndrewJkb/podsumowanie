package pl.lait.podsumowanie;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Common {
	static WebDriver driver;

	public static void goToMainPage() {
		driver = Init.getdriver();
	}
	
	public static void linkClick(String linkText) {
		System.out.println("Klikam w link: "+ linkText);
		try {
		driver.findElement(By.linkText(linkText)).click();
		}
		catch (Exception e) {
			System.out.println("Generuję print screen z błędem");
			Init.printScr(driver);
			assertTrue("Nie znalazłem linku: " + linkText, false);
		}
	}
	
	
	
	
	
	
}
