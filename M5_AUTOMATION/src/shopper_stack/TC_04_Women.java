package shopper_stack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_04_Women {
	@Test(groups = "functional")
	public void women() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		// step 1-->get an object of external file
		FileInputStream fis = new FileInputStream("./commondata/m5login.properties");
		// step 2-->create an obj for properties
		Properties prop = new Properties();
		// step 3-->load the file
		prop.load(fis);
		// step 4-->read the data
		String url = prop.getProperty("url");
		// System.out.println(data);

		driver.get(url);
		// click on login button in welcome page
		driver.findElement(By.id("loginBtn")).click();
		// enter email
		driver.findElement(By.id("Email")).sendKeys("harry@gmail.com");
		// enter pwd
		driver.findElement(By.id("Password")).sendKeys("Harry@123");
		// click on login button
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		// click on women
		Thread.sleep(4000);
		driver.findElement(By.id("women")).click();
		// add first item to cart
		driver.findElement(By.xpath("(//button[text()='add to cart'])[1]")).click();
		Reporter.log("WOMEN-->ITEM ADDED", true);
		driver.quit();
	}
}
