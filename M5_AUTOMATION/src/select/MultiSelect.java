package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//step 1
		WebElement multiDD = driver.findElement(By.id("cars"));
		//step 2
		Select sel=new Select(multiDD);
		//step 3
		System.out.println(sel.isMultiple());
//		sel.selectByIndex(0);
//		Thread.sleep(1000);
//		sel.selectByIndex(1);
//		Thread.sleep(1000);
//		sel.selectByIndex(3);
//		//deselection
//		sel.deselectByIndex(0);
//		Thread.sleep(1000);
		sel.deselectAll();
	}

}
