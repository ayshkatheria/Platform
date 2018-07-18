package PackageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import package1.Locators;

public class TestingFile {

	WebDriver driver;
	Locators Object1;
	
	@BeforeTest
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ScrollDown\\EXEFILE\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		String URL= "https://www.tripadvisor.in/";
		driver.navigate().to(URL);
		 ((JavascriptExecutor) driver)
        .executeScript("window.scrollTo(0, 100)");
		
	}
	
	
	
	@Test
	
	public void test1() throws InterruptedException {
		
		Object1= new Locators(driver);
		
		Thread.sleep(2000);
		
		Object1.userHotel();
	}
	
	
}
