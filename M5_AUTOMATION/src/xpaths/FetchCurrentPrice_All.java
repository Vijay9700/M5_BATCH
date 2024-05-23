 package xpaths;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchCurrentPrice_All {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphones&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");
		//fetch current price of all iphones
		Thread.sleep(2000);
		List<WebElement> allPrice = driver.findElements
 (By.xpath("//div[@class='_4rR01T']/../../div[2]/div[1]/div[1]/div[1]"));
		for (WebElement price : allPrice) {
			System.out.println(price.getText());
		}
		
		driver.quit();
	}

}
