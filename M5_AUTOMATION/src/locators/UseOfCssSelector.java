package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfCssSelector {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify email using css
		driver.findElement
(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("romeo@gmail.com");
		//identify pwd 
		driver.findElement
		(By.cssSelector("input[type='password']")).sendKeys("romeo@123");
		//identify login
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
