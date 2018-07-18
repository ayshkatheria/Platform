package com.testCase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Package1.login_Different_Browser;

public class crossBrowser {

	WebDriver driver;
	login_Different_Browser object1;

	@Parameters({"browser","baseurl"})		
	@BeforeMethod
	public void configuration(String browser , String baseurl) {
		if(browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Parallel_Execution\\Exefolder\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Launching FireFox");
			
		}	else if(browser.equalsIgnoreCase("Chrome")) {
			

			System.setProperty("webdriver.chrome.driver", "D:\\Parallel_Execution\\Exefolder\\chromedriver.exe");
			driver = new ChromeDriver();
			
			System.out.println("Launching Chrome");
		}

		else if(browser.equalsIgnoreCase("IE")) {
			
           System.setProperty("webdriver.ie.driver", "D:\\Parallel_Execution\\Exefolder\\IEDriverServer.exe");
           driver = new InternetExplorerDriver();
			
			System.out.println("Launching IE");
		}
		
		
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
	}

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