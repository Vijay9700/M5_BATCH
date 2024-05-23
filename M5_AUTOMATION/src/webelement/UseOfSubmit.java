package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfSubmit {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify reg link and click
		WebElement regLink = driver.findElement(By.linkText("Register"));
		regLink.submit();
		
		driver.get("https://www.facebook.com/");
		//identify login button and click
		driver.findElement(By.name("login")).submit();
	}

}
