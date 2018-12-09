package pl.lait.podsumowanie;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenuTest  extends Common{
	
	@Test
	public void topMenu() {
		String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
		goToMainPage();
		//Init.printScr(driver, "TopMenuTest", testName);
		//driver.findElement(By.linkText("About")).click();
		
		linkClick("About");
		linkClick("Suport");
		
		//Init.printScr(driver, "TopMenuTest", testName);
		///Init.printScr(driver, "TopMenuTest", testName);
		
		driver.quit();
		
	}
	
	@Test
	public void topMenu2() {
		//WebDriver driver = Init.getdriver(); juz tu nie potzrbny bo jest w commonie
		goToMainPage();
		String title = driver.getTitle();
		System.out.println(title);
		String curentUrl = driver.getCurrentUrl();
		System.out.println(curentUrl);
		
		driver.findElement(By.linkText("Support")).click();
		Init.printScr(driver);
		
		title = driver.getTitle();
		System.out.println(title);
		
		String curentUrl1 = driver.getCurrentUrl();
		//String spodziewanyTytul = "jakiś tytył";
		
		System.out.println(curentUrl1);
		
		//assertTrue("Page title is wrong !!!", title.equals("Jakiś tytuł"));
		
		//boolean czyTytul;
		
		//czyTytul = title.equals(spodziewanyTytul);
		//czyTytul = spodziewanyTytul.equals(title);// jeśli tu bedzie null to da falls
		
		driver.quit();
	}

}
