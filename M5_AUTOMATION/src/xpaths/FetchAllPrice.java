package xpaths;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllPrice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		//fetch all prices
		Thread.sleep(2000);
		List<WebElement> allPrices = driver.
				findElements(By.xpath("//a[@class='hrefch']/../../h5"));
		//print all prices
		for (WebElement price : allPrices) {
			System.out.println(price.getText());
		}
		driver.quit();
	}

}
