package shopper_stack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_06_Electronic {
	@Test(groups = "end")
	public void electronic() throws InterruptedException, IOException {
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
		// click on electronic
		driver.findElement(By.xpath("//a[@name='electronics']")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		// fetch actual price
		Thread.sleep(2000);
		WebElement actualPrice = driver
				.findElement(By.xpath("//span[text()='SAMSUNG Galaxy Z Flip4 ']/../div/p/span[2]"));
		Thread.sleep(1000);
		Reporter.log("Electronic--ACTUAL PRICE  " + actualPrice.getText(), true);
		driver.quit();
	}
}
