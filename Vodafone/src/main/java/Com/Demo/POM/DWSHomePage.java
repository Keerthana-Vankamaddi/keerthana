package Com.Demo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSHomePage {
	public WebDriver driver;
public DWSHomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
@FindBy(xpath = "//a[text()='Register']")
private WebElement register;
public WebElement getRegister() {
	return register;
}

}
