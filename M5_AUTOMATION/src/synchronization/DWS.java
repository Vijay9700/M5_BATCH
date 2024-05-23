package synchronization;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().
		   implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000); 
		//click on jw link
		driver.findElement(By.xpath("(//a[@href='/jewelry'])[3]")).click();
		//click on add to cart
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		//enter length in cm
		driver.findElement(By.id("product_attribute_71_10_16")).sendKeys("10");
		//click on add to cart
		driver.findElement(By.id("add-to-cart-button-71")).click();
		//click on shopping cart link
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	}

}
