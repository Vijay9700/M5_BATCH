package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Register {
	public static void main(String[] args) {
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//navigate to DWS
		driver.get("https://demowebshop.tricentis.com/register");
		//identify male radiobutton and click
		driver.findElement(By.id("gender-male")).click();
		//identify fn and pass data
		driver.findElement(By.id("FirstName")).sendKeys("ROMEO");
		//identify ln and pass data
		driver.findElement(By.id("LastName")).sendKeys("JULIET");
		//identify email and pass data
		driver.findElement(By.id("Email")).sendKeys("romeo@gmail.com");
		//identify pwd and pass data
		driver.findElement(By.id("Password")).sendKeys("romeo@123");
		//identify cpwd and pass data
		driver.findElement(By.id("ConfirmPassword")).sendKeys("romeo@123");
		//identify reg and click
		driver.findElement(By.id("register-button")).click();
	}

}
