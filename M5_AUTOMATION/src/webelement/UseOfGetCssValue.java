package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetCssValue {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		//identify login button
		WebElement loginButton = driver.findElement(By.name("login"));
		//fetch color of loginButton
		String color = loginButton.getCssValue("color");
		System.out.println(color);
		//fetch font
		String font = loginButton.getCssValue("font");
		System.out.println(font);
		//feth font_family
		String family = loginButton.getCssValue("font-family");
		System.out.println(family);
		driver.quit();
		
	}

}
