package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DayDD {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//step 1-->identify the dd
		WebElement dayDD = driver.findElement(By.id("day"));
		//step 2--->create an obj for select and pass dd ref
		Select sel=new Select(dayDD);
		//step 3-->use select class methods
		sel.selectByIndex(17);
		Thread.sleep(1000);
		sel.selectByValue("7");
		Thread.sleep(1000);
		sel.selectByVisibleText("9");
		sel.deselectByValue("7");
	}

}
