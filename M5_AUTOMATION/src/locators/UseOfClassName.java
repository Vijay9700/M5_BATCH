package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfClassName {
	public static void main(String[] args) throws InterruptedException {
		//launch chrome
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//navigate to Dws
		driver.navigate().to("https://demowebshop.tricentis.com/");
		//identify reg link and click
		Thread.sleep(1000);
		driver.findElement(By.className("ico-register")).click();
		
	}

}
