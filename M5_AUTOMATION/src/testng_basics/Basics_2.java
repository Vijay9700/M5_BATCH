package testng_basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basics_2 {
	 @Test()
	public void register() {
		//System.out.println("Register completed");
		Reporter.log("Register completed",true);
	}
	@Test(dependsOnMethods = "register")
	public void login() {
		//System.out.println("login completed");
		Reporter.log("login completed",true);
	}
	@Test(dependsOnMethods = "login")
	public void logout() {
		//System.out.println("logout completed");
		Reporter.log("logout completed",true);
	}

	
}
