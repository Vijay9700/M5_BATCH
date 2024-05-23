package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().
        to("https://demoapps.qspiders.com/ui/frames?sublist=0");
		//enter username
		Thread.sleep(3000);
		driver.switchTo().defaultContent  ();
		driver.findElement(By.id("username")).sendKeys("ROMEO");
	}

}
