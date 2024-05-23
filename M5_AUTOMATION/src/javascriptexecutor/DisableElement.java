package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		//identify disabled element
		WebElement disabled = driver.
			findElement(By.xpath("//input[@class='form-control']"));
		//disabled.sendKeys("computers");-->ENIE
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='computers'",disabled);
	}

}
