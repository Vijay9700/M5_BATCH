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

public class TC_01_Register {
	@Test(groups = "smoke")
	public void register() throws IOException {
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
		// click on create account button
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		// enter fn
		driver.findElement(By.id("First Name")).sendKeys("Harry");
		// enter ln
		driver.findElement(By.id("Last Name")).sendKeys("Potter");
		// choose male
		driver.findElement(By.id("Male")).click();
		// enter phno
		driver.findElement(By.id("Phone Number")).sendKeys("9787071322");
		// enter email
		driver.findElement(By.id("Email Address")).sendKeys("harry@gmail.com");
		// enter pwd
		driver.findElement(By.id("Password")).sendKeys("Harry@123");
		// enter cpwd
		driver.findElement(By.id("Confirm Password")).sendKeys("Harry@123");
		// click on terms check box
		driver.findElement(By.id("Terms and Conditions")).click();
		// click on register button
		driver.findElement(By.id("btnDisabled")).click();
		Reporter.log("REGISTERATION SUCCESSFULLY DONE", true);
		driver.quit();
	}

}
