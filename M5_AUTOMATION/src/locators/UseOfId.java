package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfId {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify emaild textfield and pass email
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("romeo@gmail.com");
		//identify pwd and pass data
		driver.findElement(By.id("pass")).sendKeys("romeo@123");
		Thread.sleep(2000);
		//driver.findElement(By.id("u_0_5_la")).click();//won't work
		//use of name loator
		driver.findElement(By.name("login")).click();
	}

}
