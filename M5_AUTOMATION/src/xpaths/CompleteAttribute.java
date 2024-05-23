package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/signup");
		//identify fn and pass data
		Thread.sleep(1000); 
		driver.findElement(By.xpath("input[name='firstname']")).sendKeys("ROMEO");
	}

}
