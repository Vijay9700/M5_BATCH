package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_StartWith_4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		//fetch all links
		List<WebElement> allLinks = 
		driver.findElements(By.xpath("//a[starts-with(text(),'4')]"));
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
		}
		driver.quit();
	}

}
