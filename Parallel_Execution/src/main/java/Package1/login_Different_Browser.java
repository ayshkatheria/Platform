package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_Different_Browser {

WebDriver driver;
	
	
	
	
	By district_text =  By.name("idp");
	
	By go_button = By.id("pmlogin");
	
	By user_Name = By.name("username");
	
	By password = By.name("password");
	
	By login_button = By.xpath("//input[@value='Login']");
	
public login_Different_Browser(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
public void Function_Dtext(String str_text) {
	driver.findElement(district_text).sendKeys(str_text);
	System.out.println(str_text);
}

public void Function_GoButton() {
	
driver.findElement(go_button).click();
	
}

public void Function_UserName(String str_Uname) {
driver.findElement(user_Name).sendKeys(str_Uname);

}

public void Function_Pswrd(String str_passwrd) {
driver.findElement(password).sendKeys(str_passwrd);
}

public void Function_LoginButton() {
driver.findElement(login_button).click();
}
}
