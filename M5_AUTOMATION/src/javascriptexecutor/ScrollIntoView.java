package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//identify subscribe button
		WebElement subscribe = driver.
		findElement(By.xpath("//button[text()='Subscribe']"));
		//step 1
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//step 2
		Thread.sleep(1000);
		js.executeScript
		
		("arguments[0].scrollIntoView(false)",subscribe );
	}

}
