package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Register {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//identify fn and pass data
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ROMEO");
		//identify sn and pass data
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("JULIET");
		//IDENTIFY PHNO AND PASS DATA
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9787071322");
		//IDENTIFY PWD AND PASS DATA
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("ROMEO@123");
		//identify radio buttons
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	}

}
