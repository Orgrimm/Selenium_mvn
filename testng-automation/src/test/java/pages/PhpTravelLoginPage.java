package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjectModel.PhpTRAVEL;

public class PhpTravelLoginPage {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thrall\\Downloads\\selenium-java-3.12.0\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void mainPageLogin() throws InterruptedException {

		driver.get("https://phptravels.net/");

		PhpTRAVEL pt = new PhpTRAVEL(driver);
		pt.myAccount.click();
		Thread.sleep(1000);
		pt.loginqwe.click();
		Thread.sleep(1000);
		pt.eMail.sendKeys("user@phptravels.com");
		Thread.sleep(1000);
		pt.password.sendKeys("demouser");
		Thread.sleep(1000);
		pt.loginBtn.click();
		Thread.sleep(1000);
		pt.hotels.click();

	}

	public void moveSilder() {
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement silder = driver.findElement(By.id("slider"));
		Dimension dim = silder.getSize();
		int x = dim.getWidth();
		Actions act = new Actions(driver);
		// Code of Silder
		act.clickAndHold(silder).moveByOffset(x - 350, 0).release().build().perform();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Tutorial36 obj = new Tutorial36();
		obj.setUP();
		obj.moveSilder();

	}
}

// @Test(description = "Verify labels and tab links are displayed")
//
// public void labelsVerification() {
//
// assertEquals(driver.getTitle(), "Web Orders Login", "LoginPage is not
// displayed. Application is down.");
//

// allOrdersPage = new AllOrdersPage(driver);
// assertTrue(allOrdersPage.webOrders.isDisplayed(), "Web Orders is not
// displayed.");
// assertTrue(allOrdersPage.listOfAllOrders.isDisplayed(), "List Of All Orders
// label is not displayed.");
// assertEquals(allOrdersPage.welcomeMsg.getText().replace(" | Logout", ""),
// "Welcome, " + userId + "!");
// assertTrue(allOrdersPage.listOfAllOrders.isDisplayed(), "List Of All Orders
// label is not displayed.");
// assertTrue(allOrdersPage.orderTab.isDisplayed(), "orderTab is not
// displayed.");
//
