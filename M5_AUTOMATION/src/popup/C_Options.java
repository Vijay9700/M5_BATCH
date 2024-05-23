package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C_Options {
	public static void main(String[] args) {
		//step 1
		ChromeOptions option=new ChromeOptions();
		//step 2
		option.addArguments("headless");
		//step 3
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		System.out.println("done");
		driver.quit();
	}

}
