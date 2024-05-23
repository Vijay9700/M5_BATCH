package alert;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/5");
		Thread.sleep(40000);
		driver.findElement
(By.xpath("//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj']")).click();
		String pwid = driver.getWindowHandle();
		Set<String> allWid = driver.getWindowHandles();
		for (String wid : allWid) {
			String allTitles = driver.switchTo().window(wid).getTitle();
			System.out.println(allTitles);
			if(allTitles.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
			{
				driver.close();
			}
		}
	}

}
