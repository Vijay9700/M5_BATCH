package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FB_Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		Date date=new Date();
		System.out.println(date);
		String cdate = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(cdate);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		// email
		driver.findElement(By.id("email")).sendKeys("romeo@gmail.com");
		// step 1-->downcast
		Thread.sleep(1000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		// step 2
		File temp1 = ts.getScreenshotAs(OutputType.FILE);
		// step 3
		File perm1 = new File("./screenshot/ss"+cdate+".png");
		// step 4
		FileHandler.copy(temp1, perm1);
		// pwd
		driver.findElement(By.id("pass")).sendKeys("qwertyuio");
		// step 2
		File temp2 = ts.getScreenshotAs(OutputType.FILE);
		// step 3
		Thread.sleep(1000);
		File perm2 = new File("./screenshot/ss"+cdate+".png");
		// step 4
		FileHandler.copy(temp2, perm2);
		driver.quit();
	}

}
