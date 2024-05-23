package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		//identify hidden element
		WebElement hidden = driver.
				findElement(By.name("custom_gender"));
		//hidden.sendKeys("others");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='others'",hidden);
	} 

}
