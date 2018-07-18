import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Package1.login_Different_Browser;
public class Test_File {
	WebDriver driver;
	login_Different_Browser object1;
	@Parameters({"browser","baseurl"})		
	@BeforeMethod

	public void configuration(String browser , String baseurl) {
		if(browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Parallel_Execution\\Exefolder\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("FireFox Lunch");

		}

		else if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println(2);

			System.setProperty("webdriver.chrome.driver", "D:\\Parallel_Execution\\Exefolder\\chromedriver.exe");

			driver = new ChromeDriver();


		}

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	//	public void setup() {
	//		
	//		System.setProperty("webdriver.chrome.driver", "D:\\help\\exefoldr\\chromedriver.exe");
	//		
	//		driver = new ChromeDriver();
	//			
	//		driver.get("https://unifyrqa.performancematters.com/landing.jsp");
	//		
	//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	//		driver.manage().window().maximize();
	//		
	//		
	//	

	@Test

	public void user_Loging() throws InterruptedException {
		object1 = new login_Different_Browser(driver);
		Thread.sleep(2000);

		object1.Function_Dtext("");
		object1.Function_GoButton();
		object1.Function_UserName("ayshwarya.katheria");
		object1.Function_Pswrd("Anita@05");
		object1.Function_LoginButton();
		//			Thread.sleep(2000);
		//			object1.Function_helpIcon();
		//		    object1.hover();
		//		    object1.nameOfAllLinks();
	}
}








