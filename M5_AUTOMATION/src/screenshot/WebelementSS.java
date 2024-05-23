package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebelementSS {
	public static void main(String[] args) throws InterruptedException, IOException {
		Date date=new Date();
		System.out.println(date);
		String cdate = date.toString().
				    replace(" ", "_").replace(":", "_");
		System.out.println(cdate);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		// email
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("romeo@gmail.com");
		File temp = email.getScreenshotAs(OutputType.FILE);
		File perm=new File("./screenshot/WESS"+cdate+".png");
		FileHandler.copy(temp, perm) ;
		driver.quit();
	}

}
