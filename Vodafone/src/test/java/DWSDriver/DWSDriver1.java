package DWSDriver;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Com.Demo.POM.DWSHomePage;
import Com.Demo.POM.DWSLogin;
import Com.Demo.POM.DWSRegister;
import DemoWebShop.DWSBaseClass;

public class DWSDriver1 extends DWSBaseClass {
	@Test(enabled = false)
	public void test1() throws InterruptedException, EncryptedDocumentException, IOException {
		DWSHomePage reg = new DWSHomePage(driver);
		DWSRegister register = new DWSRegister(driver);
		reg.getRegister().click();
		Thread.sleep(3000);
		register.getFemaleRadio().click();
		Thread.sleep(3000);
		register.getFirstName().sendKeys(util.data("DWB_login", 11, 2));
		register.getLastname().sendKeys(util.data("DWB_login", 12, 2));
		register.getEmail().sendKeys(util.data("DWB_login", 13, 2));
		Thread.sleep(3000);
		register.getPassword().sendKeys(util.data("DWB_login", 14, 2));
		register.getConfirmPassword().sendKeys(util.data("DWB_login", 15, 2));
		Thread.sleep(3000);
		register.getRegister().click();
	}
		@Test
		public void login() throws InterruptedException, EncryptedDocumentException, IOException {
		DWSLogin login=new DWSLogin(driver);
		login.getLogin().click();
		login.getEmail().sendKeys(util.data("DWB_login",18 ,2));
		login.getPassword().sendKeys(util.data("DWB_login", 19, 2));
		login.getLoginbutton().click();
		Thread.sleep(3000);
		}

}
