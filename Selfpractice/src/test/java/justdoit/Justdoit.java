package justdoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Justdoit {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thrall\\Downloads\\selenium-java-3.12.0\\drivers\\chromedriver.exe");

		String url = "http://opensource.demo.orangehrmlive.com/";
		String expectedTitle = "OrangeHRM";

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		if (driver.getTitle().equals("OrangeHRM")) {
			System.out.println("pass");
		} else {

			System.out.println("failed");
		}

		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement login = driver.findElement(By.id("btnLogin"));
		username.sendKeys("Admin");
		password.sendKeys("admin");
		login.click();
		
		String expectedUrl = "http://opensource.demo.orangehrmlive.com/index.php/dashboard";

		if (driver.getTitle().equals(expectedUrl)) {
			System.out.println("pass");
		} else {
			System.out.println("failed");
		}

	}
}