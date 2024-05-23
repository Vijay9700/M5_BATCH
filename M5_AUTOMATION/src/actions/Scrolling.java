package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		//identify subscribe button
		WebElement subscribe = driver.
		findElement(By.xpath("//button[text()='Subscribe']"));
		Actions at=new Actions(driver);
		Thread.sleep(1000);
		at.scrollToElement(subscribe).perform();
	}
}
