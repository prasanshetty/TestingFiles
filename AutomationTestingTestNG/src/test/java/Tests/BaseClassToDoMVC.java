package Tests;
import org.testng.annotations.*;

import com.opencsv.CSVReader;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class BaseClassToDoMVC {

	public WebDriver driver;
	String baseURL = "https://todomvc.com/examples/vue/";
	String path = System.getProperty("user.dir");
	/*
	 * String CSV_PATH = path +"\\src\\test\\resources\\todotasksdatafile.csv";
	 * public CSVReader csvReader; String[] csvCell;
	 */

	@BeforeSuite
	public void setUp() {
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path +"\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	@AfterSuite
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
