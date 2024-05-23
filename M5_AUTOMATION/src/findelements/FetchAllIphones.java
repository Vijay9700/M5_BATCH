package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllIphones {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//identify search textfield
		driver.findElement(By.name("q")).sendKeys("iphones");
		//click on search icon
		driver.findElement
		(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		//fetch all iphones names
		List<WebElement> allNames = 
	driver.findElements(By.xpath("//div[contains(text(),'APPLE')]"));
		//iterate
		for (WebElement name : allNames) {
			System.out.println(name.getText());
		}
		driver.quit();
	}

}
