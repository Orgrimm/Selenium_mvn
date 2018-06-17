package newpackage;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fbook {

	public static void main(String[] args) {
		
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thrall\\Downloads\\selenium-java-3.12.0\\drivers\\chromedriver.exe");
		ChromeDriver drv = new ChromeDriver();
		
		String url = "http://opensource.demo.orangehrmlive.com/";

		drv.get(url);

		String Title = drv.getTitle();
		String expectedTitle = "OrangeHRM";

		if (Title.equals(expectedTitle)) {
			System.out.println("The maint page successfully loaded. WELCOME");

		} else {
			System.out.println("Page is unaccessible. Please try again");

			WebElement username = drv.findElement(By.id("txtUsername"));
			WebElement password = drv.findElement(By.id("txtPassword"));
			WebElement loginBtn = drv.findElement(By.xpath("btnLogin"));

			username.sendKeys("Admin");
			password.sendKeys("admin");
			loginBtn.click();

			String expectedUrl = "http://opensource.demo.orangehrmlive.com/index.php/dashboard";

			if (drv.getCurrentUrl().equals(expectedUrl))
				;
			{

				System.out.println("It works");

			}

		}

	}

}