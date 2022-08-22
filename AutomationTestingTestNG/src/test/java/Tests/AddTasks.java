package Tests;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.opencsv.exceptions.CsvValidationException;

public class AddTasks extends BaseClassToDoMVC {
	// Add Tasks
	@Test
	public void addTasks() throws CsvValidationException, IOException, InterruptedException {
		//csvReader = new CSVReader(new FileReader(CSV_PATH));
		// You can use while loop like below, It will be executed until the last line in
		// CSV used.
		/*
		 * while ((csvCell = csvReader.readNext()) != null) { String TaskName =
		 * csvCell[0];
		 */
		
			driver.findElement(By.className("new-todo")).sendKeys("Task1", Keys.ENTER);
		
	}
// Select All Task
	@Test
	public void selectAllTasks() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement selectalltasks = driver.findElement(By.id("toggle-all"));
		js.executeScript("arguments[0].click();", selectalltasks);
	}
// Display All active Tasks
	@Test
	public void displayActiveTasks() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement selectactivetasks = driver.findElement(By.linkText("Active"));
		js.executeScript("arguments[0].click();", selectactivetasks);
	}
// Display All Completed Tasks
	@Test
	public void displayCompletedTasks() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement selectcompletedtasks = driver.findElement(By.linkText("Completed"));
		js.executeScript("arguments[0].click();", selectcompletedtasks);
	}

	@Test
	public void markOneTaskAsActive() throws InterruptedException, CsvValidationException, IOException {
		/*
		 * csvReader = new CSVReader(new FileReader(CSV_PATH)); csvCell =
		 * csvReader.readNext(); String firstTask = csvCell[0];
		 */
		//String firstTask= CSVClass.getcsvvalue()[0];
		
		Actions action = new Actions(driver);
		
		System.out.println(driver.getPageSource());
		
		WebDriverWait wait = new WebDriverWait(driver, 30); 
		WebElement hoverTasks = driver.findElement(By.xpath("//label[(contains(text(),'Task1'))]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[(contains(text(),'Task1'))]")));
		 //action.moveToElement(hoverTasks).build().perform(); 
		 Thread.sleep(50000);	
	}
	
}
