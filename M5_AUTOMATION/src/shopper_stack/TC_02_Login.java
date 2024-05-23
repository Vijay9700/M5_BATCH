package shopper_stack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom_pages.Login_Page;
import pom_pages.Welcome_Page;
import utilities.Excel_Utility;
import utilities.Properties_Utility;

public class TC_02_Login {
	@Test
	public void login() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
//
//		// step 1-->get an object of external file
//		FileInputStream fis = new FileInputStream("./commondata/m5login.properties");
//		// step 2-->create an obj for properties
//		Properties prop = new Properties();
//		// step 3-->load the file
//		prop.load(fis);
//		// step 4-->read the data
//		String url = prop.getProperty("url");
//		// System.out.println(data);
		Properties_Utility p=new Properties_Utility();
		String url = p.readProperty("url");
		driver.get(url);
		// click on login button in welcome page
//		driver.findElement(By.id("loginBtn")).click();
		Welcome_Page welcome=new Welcome_Page(driver);
		welcome.getLogin_Button().click();

		// use excel data
//		// step 1-->get the object of external file
//		FileInputStream fis1 = new FileInputStream("./testscriptdata/logindata.xlsx");
//		// step 2-->open workbook in read mode
//		Workbook workbook = WorkbookFactory.create(fis1);
//		// step 3-->get sheet control
//		Sheet sheet = workbook.getSheet("login");
//		// step 4-->get row control
//		Row row = sheet.getRow(1);
//		// step 5-->get cell control
//		Cell cell = row.getCell(0);
//		// step 6-->read the data
//		String email = cell.getStringCellValue();
//		System.out.println(email);
//		// read pwd
//		Cell cell1 = row.getCell(1);
//		String pwd = cell1.getStringCellValue();
		Excel_Utility e=new Excel_Utility();
		String email = e.readExcel("login", 1, 0);
		String pwd = e.readExcel("login", 1, 1);
		// enter email
//		driver.findElement(By.id("Email")).sendKeys(email);
		Login_Page login=new Login_Page(driver);
		login.getEmail_textfield().sendKeys(email);
		// enter pwd
//		driver.findElement(By.id("Password")).sendKeys(pwd);
		login.getPassword_textfield().sendKeys(pwd);
		// click on login button
//		driver.findElement(By.xpath("//span[text()='Login']")).click();
		login.getLogin_button().click();
		Reporter.log("LOGIN SUCCESSFULLY COMPLETED", true);
		driver.quit();
	}

}
