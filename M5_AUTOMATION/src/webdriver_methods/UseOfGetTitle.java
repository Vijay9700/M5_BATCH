package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetTitle {
	public static void main(String[] args) {
		//launch browser
		WebDriver driver=new ChromeDriver();
		//navigate to Fb
		driver.get("https://www.facebook.com/");
		//fetch the title
		String title = driver.getTitle();
		System.out.println(title);
	}

}
