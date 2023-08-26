package ActiTime;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class ActiBaseClass {
public WebDriver driver;
public ActiUtilityClass util=new ActiUtilityClass();
@BeforeClass
public void actiBC() throws EncryptedDocumentException, IOException {
	if(util.data("ActiLogin", 3, 2).equals("chrome"))
		driver=new ChromeDriver();
	else if(util.data("ActiLogin", 3, 2).equals("edge"))
		driver=new EdgeDriver();
	else if(util.data("ActiLogin", 3, 2).equals("firefox"))
		driver=new FirefoxDriver();

}
@BeforeMethod
public void maxWin() throws EncryptedDocumentException, IOException {
	driver.get(util.data("ActiLogin", 4, 2));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
@AfterMethod
public void minWin() {
	driver.manage().window().minimize();
}
@AfterClass
public void actiAC()
{
	driver.quit();
}
}




















































