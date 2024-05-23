package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//step 1-->create class same as webpage name
public class Welcome_Page {
	//step 2-->create a parametrized constructor
	public Welcome_Page(WebDriver driver){
		//step 4-->initialize the webelement
		PageFactory.initElements(driver,this);
	}
    //step 3-->identify webelement
	@FindBy(id = "loginBtn")
	private WebElement login_Button;

	public WebElement getLogin_Button() {
		return login_Button;
	}
}
