package pomdesign;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pages.WebOrdersLoginPage;

public class WebOrderLoginTests {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thrall\\Downloads\\selenium-java-3.12.0\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Ignore
	public void positiveloginTest() {

		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

	}

	@Test(priority = 1)
	public void positiveLiginUsingPOM() {
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		// create object from WebOrdersLoginPage Class

		WebOrdersLoginPage loginPage = new WebOrdersLoginPage(driver);

		loginPage.userName.sendKeys("Tester");
		loginPage.password.sendKeys("test");
		loginPage.loginButton.click();

	}

//	@Test(priority = 2)
//	public void invalidUsernameTest() {
//		WebOrdersLoginPage loginPage = new WebOrdersLoginPage(driver);
//		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
//		loginPage.userName.sendKeys("Tester");
//		loginPage.password.sendKeys("test");
//		loginPage.loginButton.click();
//		String errMsg = loginPage.invalidUserNameErrMsg.getText();
//		assertEquals(errMsg, "Invalid Login or Password.");
		
		//logout after each test then close the browser
		
		//@AfterMethod
		
		//public void logout() {
			
			
		}

	}
}
