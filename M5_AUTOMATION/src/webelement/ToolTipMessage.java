package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipMessage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(5000);
		//click on with tool tip
		driver.findElement(By.xpath("(//li)[3]")).click();
		//identify name text field
		WebElement nameTextField = driver.findElement(By.name("name"));
		String toolTip = nameTextField.getAttribute("title");
		System.out.println(toolTip);
		//quit
		driver.quit();
	}

}
