package DemoWebShop;

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

public class DWSBaseClass {
	public WebDriver driver;
	public DWSUtility util = new DWSUtility();

	@BeforeClass
	public void demoBC() throws EncryptedDocumentException, IOException {
		if (util.data("DWB_login", 3, 2).equals("chrome"))
			driver = new ChromeDriver();
		else if(util.data("DWB_login", 3, 2).equals("edge"))
			driver=new EdgeDriver();
		else if(util.data("DWB_login", 3, 2).equals("firefox"))
			driver= new FirefoxDriver();
	}
		@BeforeMethod
	public void winMax() throws EncryptedDocumentException, IOException {
			driver.get(util.data("DWB_login", 4, 2));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		@AfterMethod
		public void winMin() throws EncryptedDocumentException, IOException {
			
			driver.manage().window().minimize();
		}
		@AfterClass
		public void demoAc () {
		driver.quit();

		}
	
	
}
