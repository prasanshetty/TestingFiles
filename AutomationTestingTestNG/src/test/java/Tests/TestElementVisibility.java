package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestElementVisibility {

	WebDriver driver = new ChromeDriver();	
	public boolean isElementPresent(By locatorKey) {
	    try {
	        driver.findElement(locatorKey);
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}

	public boolean isElementVisible(String cssLocator){
	    return driver.findElement(By.xpath("//label[(contains(text(),'Task1'))]")).isDisplayed();
	}
}
