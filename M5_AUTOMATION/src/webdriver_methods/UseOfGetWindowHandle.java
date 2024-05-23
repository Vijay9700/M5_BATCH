package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetWindowHandle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver
.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//fetch only pwid
		String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		//click on button
		driver.findElement(By.id("newWindowBtn")).click();
		//fetch all wids
		Set<String> allWids = driver.getWindowHandles();
	 	System.out.println(allWids);
		driver.quit();
	}

}
