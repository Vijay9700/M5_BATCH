package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		//identify src we
		WebElement WDC = driver.findElement(By.id("box3"));
		WebElement uSA = driver.findElement(By.id("box103"));
		//step 1
		Actions act=new Actions(driver);
		act.dragAndDrop(WDC, uSA).perform();
	}

}
