package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_RadioButtons {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> allRadioButton = 
				driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement radioButton : allRadioButton) {
			radioButton.click();
			Thread.sleep(1000);
		}
	}

}
