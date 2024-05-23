package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get
		("https://the-internet.herokuapp.com/javascript_alerts");
		//click on js Alert button
//		driver.findElement
//		(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(1000);
		//fetch alert message
		String message = driver.switchTo().alert().getText();
		System.out.println(message);
		//handling alert
//		driver.switchTo().alert().accept();
//		Alert alert = driver.switchTo().alert();

}
}
