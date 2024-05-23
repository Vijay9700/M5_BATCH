package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfLinkText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		//identify register and click
		Thread.sleep(1000);
		//driver.findElement(By.linkText("Register ")).click();
		driver.findElement(By.partialLinkText("ister")).click();
	}

}
