package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		// right click operation
		// step 1-->create an obj for Ations and pass driver ref
		Actions act = new Actions(driver);
		// step 2--->use actions class method
		act.contextClick().perform();
		//act.mov
	}

}
