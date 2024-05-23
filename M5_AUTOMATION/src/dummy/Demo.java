package dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com/");
//		driver.findElement(By.linkText("Books\r\n"
//				+ "        "));
		driver.get("https://www.flipkart.com/");
	}

}
