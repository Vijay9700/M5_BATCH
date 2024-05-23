package webdriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfTo {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//fb
		Thread.sleep(1000);
		driver.navigate().to("fqurl of wapp");
		//to(URL url)
		URL url=new URL("fqurl of w.app");
		driver.navigate().to(url);
		
		
	}

}
