package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

public class SuiteCRM {

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
		new LoginPage(driver).login("admin", "pass");
		WebElement username = driver.findElement(By.id("user_name"));
		WebElement password = driver.findElement(By.id("username_password"));
		WebElement loginBtn = driver.findElement(By.id("bigbutton"));
		username.sendKeys("admin");
		password.sendKeys("pass");
		loginBtn.click();
		Thread.sleep(3000);
		WebElement textBox = driver.findElement(By.xpath("(//imput[@id = 'text'])[1]"));
		textBox.sendKeys("Chicago Test" + Keys.ENTER);

	}
}
