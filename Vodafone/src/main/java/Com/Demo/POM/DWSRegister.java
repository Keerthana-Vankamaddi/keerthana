package Com.Demo.POM;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSRegister {
public WebDriver driver;
public DWSRegister(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//label[text()='Female']")
private WebElement femaleRadio;
public WebElement getFemaleRadio() {
	return femaleRadio;

}
@FindBy(id = "FirstName")
private WebElement firstName;
public WebElement getFirstName() {
	return firstName;
}
@FindBy(xpath = "//input[@name='LastName']")
private WebElement lastname;
public WebElement getLastname() {
	return lastname;
}
@FindBy(xpath = "//input[@name='Email']")
private WebElement Email;
public WebElement getEmail() {
	return Email;
}
@FindBy(xpath = "//input[@id='Password']")
private WebElement Password;
public WebElement getPassword() {
	return Password;
}
@FindBy(xpath = "//input[@id='ConfirmPassword']")
private WebElement confirmPassword;
public WebElement getConfirmPassword() {
	return confirmPassword;
}
@FindBy(xpath = "//input[@id='register-button']")
private WebElement Register;
public WebElement getRegister() {
	return Register;
}

}
