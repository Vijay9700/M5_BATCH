package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfClose_Quit {
	public static void main(String[] args) throws InterruptedException {
		// launch chrome
		WebDriver driver = new ChromeDriver();
		// navigate to FB
		driver.
		get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//close
		Thread.sleep(1000);
		//identify the button and click
		driver.findElement(By.id("newWindowBtn")).click();
		//close
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
	 
	}

}
