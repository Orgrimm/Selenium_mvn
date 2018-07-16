package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebOrderTests {
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

		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		loginPage = new WebOrdersLoginPage(driver);

	}

	@Test(description = "Verify labels and tab links are displayed")

	public void labelsVerification() {

		assertEquals(driver.getTitle(), "Web Orders Login", "LoginPage is not displayed. Application is down.");

		// loginPage.userName.sendKeys(userId);
		// loginPage.password.sendKeys(password);
		// loginPage.loginButton.click();
		loginPage.login(userId, password);
		allOrdersPage = new AllOrdersPage(driver);
		assertTrue(allOrdersPage.webOrders.isDisplayed(), "Web Orders is not displayed.");
		assertTrue(allOrdersPage.listOfAllOrders.isDisplayed(), "List Of All Orders label is not displayed.");
		assertEquals(allOrdersPage.welcomeMsg.getText().replace(" | Logout", ""), "Welcome, " + userId + "!");
		assertTrue(allOrdersPage.listOfAllOrders.isDisplayed(), "List Of All Orders label is not displayed.");
		assertTrue(allOrdersPage.orderTab.isDisplayed(), "orderTab is not displayed.");

	}

	@Test(description = "Verify default Products and prices")

	public void availableProductsTest() {

		assertEquals(driver.getTitle(), "Web Orders Login", "LoginPage is not displayed. Application is down.");

		loginPage.login(userId, password);

		allOrdersPage = new AllOrdersPage(driver);
		allOrdersPage.ViewAllProducts.click();
		productsPage = new ProductsPage(driver);
		List<String> expProducts = Arrays.asList("MyMoney", "FamilyAlbum", "ScreenSaver");
		List<String> actProducts = new ArrayList<>();

		// productsPage.productNames.forEach(elem -> actProducts.add(elem.getText());

		for (WebElement prod : productsPage.productNames) {
			actProducts.add(prod.getText());
		}

		assertEquals(actProducts, expProducts);

		// @AfterMethod
		// public void logout() {
		// allOrdersPage.logout();
		// }

		for (WebElement row : productsPage.productsRows) {

			if (row.getText().startsWith("MyMoney")) {

			}
			System.out.println(row.getText());
			String[] prodData = row.getText().split(" ");
			switch (prodData[0]) {
			case "MyMoney":
				assertEquals(prodData[1], "$100");
				assertEquals(prodData[2], "8%");

				break;

			case "FamilyAlbum":
				assertEquals(prodData[1], "$80");
				assertEquals(prodData[2], "15%");

				break;
			case "ScreenSaver":
				assertEquals(prodData[1], "$20");
				assertEquals(prodData[2], "15%");
				break;
			}
		}

	}
}
