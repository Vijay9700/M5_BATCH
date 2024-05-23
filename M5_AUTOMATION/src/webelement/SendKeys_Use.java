package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Use {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//identify search textfield and pass data
		WebElement search = driver.findElement(By.name("q"));
		Thread.sleep(2000);
		search.sendKeys("mobile",Keys.ENTER);
	}
 
}
