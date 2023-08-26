package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class JavascriptPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://pib.gov.in/indexd.aspx");
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		Actions actions=new Actions(driver);
		WebElement mha = driver.findElement(By.xpath("//a[text()='Ministry of Home Affairs']"));
		actions.scrollToElement(mha).click(mha).build().perform();
		String conformationText = driver.switchTo().alert().getText();
		System.out.println(conformationText);
		
		
	}

}
