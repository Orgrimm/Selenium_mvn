package willtest;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Nagative3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thrall\\Downloads\\selenium-java-3.12.0\\drivers\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		String url = "https://amazon.com";
		d.get(url);

		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone");
		d.findElement(By.xpath("//input[@class='nav-input']")).click();

		List<WebElement> results = d.findElements(By.xpath("//ul[@id='s-results-list-atf']/li//h2"));

		for (WebElement result : results) {
			System.out.println(result.getText());
			boolean check = result.getText().toLowerCase().contains("iphone");
			Assert.assertTrue(check);
			
		}

		//
		// WebElement body = d.findElement(By.tagName("body"));
		// String bodyText = body.getText();
		// String text = body.getText();
		// body.getText();
		//
		// System.out.println("Text obtained is" + text);
	}
}

// String url = "http://automationpractice.com/index.php";
// d.get(url);
// WebElement login = d.findElement(By.className("login"));
// login.click();
//
// d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("drektharen@gmail.com");
// Thread.sleep(1000);
// d.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("");
// Thread.sleep(1000);
// d.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
//
// d.findElement(By.className("alert alert-danger"));
//
