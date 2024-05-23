package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfNavigate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//fb
		Thread.sleep(1000);
		driver.get("fqurl of fb");
		//amazon
		Thread.sleep(1000);
		driver.get("fqurl of amazon");
		//back
		Thread.sleep(1000);
		driver.navigate().back();
		//forward
		Thread.sleep(1000);
		driver.navigate().forward();
		//refresh
		Thread.sleep(1000); 
		driver.navigate().refresh();
		
		
	}

}
