package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetPageSource {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// fb
		Thread.sleep(1000);
		driver.navigate().to("fqurl of wapp");
		//get html code
		String src = driver.getPageSource();
		System.out.println(src);
	}

}
