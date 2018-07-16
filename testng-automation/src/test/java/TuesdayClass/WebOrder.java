package TuesdayClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Config;

public class WebOrder {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thrall\\Downloads\\selenium-java-3.12.0\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = Config.getValue("url");
		System.out.println("This is the url coming from properties file: " + url);
		driver.get(Config.getValue("url"));

	}

}