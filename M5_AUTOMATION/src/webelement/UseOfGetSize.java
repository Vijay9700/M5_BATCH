package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetSize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		//identify login button
		WebElement loginButton = driver.findElement(By.name("login"));
		//fetch the size
		Dimension size = loginButton.getSize();
		System.out.println(size);
		//fetch the location
		Point loc = loginButton.getLocation();
		System.out.println(loc);
		//use of getRect
		Rectangle rect = loginButton.getRect();
		System.out.println(rect);
		System.out.println(rect.height);
		driver.quit();
	}

}
