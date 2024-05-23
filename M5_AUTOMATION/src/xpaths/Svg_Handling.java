package xpaths;

import org.openqa.selenium.WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class Svg_Handling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/4");
		Thread.sleep(60000);
		//identify compare button and click
		//svg tag handling
		driver.findElement
(By.xpath("//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj']")).click();
		//fetch parent wid
		String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		//fetch all wid
		Set<String> allWids = driver.getWindowHandles();
		System.out.println(allWids);
		//quit
		driver.quit();
		
	}

}
