package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebpageScreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(1000);
		//step 1-->downcast
		TakesScreenshot ts=(TakesScreenshot) driver;
		//step 2
		File temp = ts.getScreenshotAs(OutputType.FILE);
		//step 3
		File perm=new File("./screenshot/ss.png");
		//step 4
		FileHandler.copy(temp, perm);
	}

}
