package Com.Demo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSLogin {
public WebDriver driver;
 public DWSLogin(WebDriver driver) {
PageFactory.initElements(driver, this);
}
 @FindBy(xpath = "//a[text()='Log in']")
 private WebElement Login;
public WebElement getLogin() {
	return Login;
}
 @FindBy(xpath = "//input[@id='Email']")
 private WebElement Email;
public WebElement getEmail() {
	return Email;
}
 @FindBy(xpath = "//input[@id='Password']")
 private WebElement Password;
public WebElement getPassword() {
	return Password;
}
 @FindBy(xpath = "//input[@value='Log in']")
 private WebElement loginbutton;
public WebElement getLoginbutton() {
	return loginbutton;
}
 
	

}
