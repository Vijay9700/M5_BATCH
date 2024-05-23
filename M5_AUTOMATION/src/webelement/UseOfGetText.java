package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetText {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
//		String text = email.getText();
//		System.out.println(text);
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		WebElement cNA = driver.
	findElement(By.xpath("//div[text()='Create a new account']"));
		System.out.println(cNA.getText());
	}

}
