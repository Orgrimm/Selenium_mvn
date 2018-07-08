package willtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Negative2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Thrall\\Downloads\\selenium-java-3.12.0\\drivers\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		String url = "http://automationpractice.com/index.php";
		d.get(url);
	    WebElement login = d.findElement(By.className("login"));
	    login.click();
		
	    d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("boratoragaga123");
	    Thread.sleep(1000);
	    d.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
	    
	    d.findElement(By.className("alert alert-danger"));

	}

}
