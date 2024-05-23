package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchCurrentPrice_FK {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/apple-iphone-15-black-128-gb/p/itm6ac6485515ae4?pid=MOBGTAGPTB3VS24W&lid=LSTMOBGTAGPTB3VS24WYZPL8F&marketplace=FLIPKART&q=iphones&store=tyy%2F4io&srno=s_1_1&otracker=AS_Query_HistoryAutoSuggest_2_0&otracker1=AS_Query_HistoryAutoSuggest_2_0&fm=organic&iid=65ad4342-b967-4f77-8a8e-2db00196ee58.MOBGTAGPTB3VS24W.SEARCH&ppt=hp&ppn=homepage&ssid=t4s12uigcg0000001704779187555&qH=3e7fa8c51e2e4986");
		//fetch current price
		Thread.sleep(2000);
		WebElement cPrice = driver.findElement
(By.xpath("//span[text()='APPLE iPhone 15 (Black, 128 GB)']/../../../div[4]/div[1]/div/div[1]"));
		System.out.println(cPrice.getText());
		driver.quit();
	}

}
