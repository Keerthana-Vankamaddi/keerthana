package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.flipkart.com/");
       WebElement cancelButton = driver.findElement(By.xpath("//button[text()='✕']"));
       cancelButton.click();
	}

}
