package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//identify search textfield
		driver.findElement(By.name("q")).sendKeys("iphones",Keys.ENTER);
		Thread.sleep(3000);
		WebElement iphone = driver.findElement
				(By.xpath("(//div[@class='_4rR01T'])[6]"));
		//scrolling
		Actions act=new Actions(driver);
		act.scrollToElement(iphone).perform();
		//fetch offer percentage
		WebElement offer = driver.findElement
(By.xpath("//div[@class='_4rR01T']/../../div[2]/div/div/div[3]"));
		System.out.println(offer.getText());
	}

}
