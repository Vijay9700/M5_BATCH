package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//navigate to fb
		driver.get("https://www.facebook.com/");
		//getSize()
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println(size.height);
		System.out.println(size.width);
		//getPosition
		Point position = driver.manage().window().getPosition();
		System.out.println(position.x);
		System.out.println(position.y);
		System.out.println(position);
		//quit
		driver.quit();
	}

}
