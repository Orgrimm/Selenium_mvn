package pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class SunDay_Esen_Sleep {

	WebDriver driver;
	WebOrdersLoginPage loginPage;
	AllOrdersPage allOrdersPage;
	ProductsPage productsPage;
	String userId = "Tester";
	String password = "test";

	@BeforeClass // runs once for all Tests
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thrall\\Downloads\\selenium-java-3.12.0\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void setUpApplication() {

		driver.get("http://the-internet.herokuapp.com/dynamic_controls");
		driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		assertEquals(driver.findElement(By.xpath("//*[@id=\"message\"]")));

	}
}