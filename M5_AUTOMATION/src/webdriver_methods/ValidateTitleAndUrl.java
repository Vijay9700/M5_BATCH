package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTitleAndUrl {
	public static void main(String[] args) {
		//launch chrome
		WebDriver driver=new ChromeDriver();
		//navigate to FB
		driver.get("https://www.facebook.com/");
		//fetch title
		String title = driver.getTitle();
		//fetch current url
		String cUrl = driver.getCurrentUrl();
		//validate
		if(title.contains("Facebook")&& cUrl.contains("facebook")) {
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
	}

}
