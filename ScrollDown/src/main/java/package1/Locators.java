package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {

	WebDriver driver;
	
	
	By mangloreLink = By.linkText("Mangalore Hotels");
	
	By guest = By.xpath("//span[@class='ui_icon caret-down']");
	
	
public	Locators(WebDriver driver) {
	
	
	this.driver = driver;
}
	
	public void userHotel() {
		
		driver.findElement(mangloreLink).click();
		
	}
}
