package childwindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_Window {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get
("https://www.hyrtutorials.com"
		+ "/p/window-handles-practice.html#google_vignette");
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(2000);
		String pwid = driver.getWindowHandle();
		Set<String> allWids = driver.getWindowHandles();
		System.out.println(pwid);
		System.out.println(allWids);
		for (String wid : allWids) {
			if(wid.equals(pwid))
			{
				
			}else
			{
				driver.switchTo().window(wid).close();
			}
		}
		//driver.close();
	}

}
