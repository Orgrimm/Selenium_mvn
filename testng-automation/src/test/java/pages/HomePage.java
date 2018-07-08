package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		// Helps LoginPage to initialize all the elements
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = )
	public void test1() throws InterruptedException {
		driver.get("http://softaculous.com/demos/SuiteCRM");
		driver.switchTo().frame("demobody");
		LoginPage lp = new LoginPage(driver);
		lp.username.sendKeys("admin");
		lp.password.sendKeys("pass");
		lp.loginBtn.click();

	}
}
