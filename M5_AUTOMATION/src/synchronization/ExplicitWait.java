package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//step 1
		WebDriverWait wait=new 
				WebDriverWait(driver, Duration.ofSeconds(100));
		//step 2
		wait.until(ExpectedConditions.alertIsPresent());
	}

}
