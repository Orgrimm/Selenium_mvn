package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class SuiteTest {

	WebDriver driver;

	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thrall\\Downloads\\selenium-java-3.12.0\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test1() throws InterruptedException {
		driver.get("http://softaculous.com/demos/SuiteCRM");
		driver.switchTo().frame("demobody");
		LoginPage lp = new LoginPage(driver);
		lp.username.sendKeys("admin");
		lp.password.sendKeys("pass");
		lp.loginBtn.click();
		Thread.sleep(3000);
		// HomePage hp = new HomePage(driver);
		// hp.textBox.sendKeys("Using POM" + Keys.ENTER);
	}
}