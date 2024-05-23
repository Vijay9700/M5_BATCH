package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfManage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//navigate
		//driver.get("https://www.facebook.com/");
		//minimize
		Thread.sleep(1000);
		//driver.manage().window().minimize();
		//fullscreen
		//Thread.sleep(1000);
		driver.manage().window().fullscreen();
	}

}
