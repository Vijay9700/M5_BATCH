package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {
	
	public Login_Page(WebDriver driver)
	{
		
	}
	@FindBy(id = "Email")
	private WebElement email_textfield;
	@FindBy(id = "Password")
	private WebElement password_textfield;
	public WebElement getEmail_textfield() {
		return email_textfield;
	}
	public WebElement getPassword_textfield() {
		return password_textfield;
	}
	public WebElement getLogin_button() {
		return login_button;
	}
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login_button;
}
