package borshe;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Borshe1 {

	public static void main(String[] args) throws InterruptedException {

		Driver.Setup();

		WebDriver d = new ChromeDriver();
		d.get("https://porsche.com/usa/modelstart/");
		// d.manage().window().fullscreen();

		// Select model 718
		d.findElement(By.xpath("//span[contains(text(),'718')]")).click();

		// Remember the price of 718 Cayman
		String rememberPrice = d
				.findElement(By.xpath("//div[@class='m-14-model-price']" + "[contains(text(),'From $ 56,900.00*')]"))
				.getText();
		System.out.println(rememberPrice);

		// Convert price of car from String to int

		int remPriceInt = StringToIntConvert.StringToInt(rememberPrice);
		System.out.println("Price was converted : " + remPriceInt);

		// Click on Build & Price under 718 Cayman
		d.findElement(By.xpath("//*[@id=\'m982120\']/div[2]/div/a")).click();
		Thread.sleep(2000);

		// Switch the tab and handle it
		String curTab = d.getWindowHandle();
		Set<String> windows = d.getWindowHandles();
		for (String newTab : windows) {
			d.switchTo().window(newTab);
		}

		Thread.sleep(3000);
		// Verify the Base price with Remembered price
		String baseStrPrice = d.findElement(By.xpath("//*[@id=\'s_price\']/div[1]/div[1]/div[2]")).getText();
		System.out.println(baseStrPrice);

		// Convert price of car from String to int
		int basePrice = StringToIntConvert.StringToInt(baseStrPrice);
		System.out.println("Base price was converted : " + basePrice);

		if (remPriceInt == basePrice) {
			System.out.println("Verified");
		} else {
			System.out.println("NOT Verified");
		}

		// Verify that Price for Equipment is 0

		String equipmentPrice = d.findElement(By.xpath("//div[@class='wrpVis']//div[2]/div[2]")).getText();
		System.out.println(equipmentPrice);
		int eqPriceInt = StringToIntConvert.StringToInt(equipmentPrice);
		if (eqPriceInt == 0) {
			System.out.println("Equipment price is :" + eqPriceInt);
		} else
			System.out.println("Equipment price is different");

		// Verify that total price is the sum of base price + Delivery, Processing and
		// Handling Fee
		// Verify delivery price
		String deliveryStrPrice = d.findElement(By.xpath("//div[@id='main']//div[3]/div[2]")).getText();
		int deliveryPrice = StringToIntConvert.StringToInt(deliveryStrPrice);
		System.out.println("Delivery price is :" + deliveryPrice);
		// Verify sum price
		String sumStrPrice = d.findElement(By.xpath("//section[@id='s_price']//div[@class='ccaTable']"
				+ "//div[@class='ccaRow priceTotal highlighted']//div[@class='ccaPrice']")).getText();
		int sumPrice = StringToIntConvert.StringToInt(sumStrPrice);
		System.err.println(sumPrice);
		// Total price=basePrice+deliveryPrice

		int totalSum = basePrice + deliveryPrice;

		if (totalSum == sumPrice) {
			System.out.println("The sum verification is passed and = " + totalSum);
		} else {
			System.out.println("The sum verification is passed and = ");
		}

		// Thread.sleep(0);
		// d.findElement(By.xpath("//*[@id=\"s_conf_submenu\"]/div/div")).click();
		// d.findElement(By.xpath("//*[@id=\"submenu_interieur_x_AI_submenu_x_submenu_parent\"]")).click();
		// Thread.sleep(1000);
		// d.findElement(By.xpath("//*[@id=\"submenu_interieur_x_AI_submenu_x_submenu_seats\"]/a")).click();
		// Thread.sleep(1000);
		// d.findElement(By.xpath("//*[@id=\"s_interieur_x_PP06\"]")).click();
		//

//		d.findElement(By.xpath("//*[@id=\"s_conf_submenu\"]/div/div")).click();
//		Thread.sleep(1000);
//		d.findElement(By.xpath("//*[@id=\"submenu_individualization_x_individual_submenu_x_submenu_parent\"]")).click();
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//*[@id=\"submenu_individualization_x_individual_submenu_x_IIC\"]/a")).click();
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//*[@id=\"vs_table_IIC_x_PEKH_x_c01_PEKH\"]")).click();
//		Thread.sleep(2000);
		// d.quit(); //*[@id="s_interieur_x_PP06"]
		
		d.findElement(By.xpath("//*[@id=\'s_conf_submenu\']/div/div")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\'submenu_individualization_x_individual_submenu_x_submenu_parent\']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\'submenu_individualization_x_individual_submenu_x_IMG\']/a")).click();
		Thread.sleep(2000);

		
		d.findElement(By.xpath("//*[@id=\'vs_table_IMG_x_M250_x_c11_M250\']")).click();
		JavascriptExecutor jse = (JavascriptExecutor)d;
		jse.executeScript("scroll(1500, 2500)");
				Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\'vs_table_IMG_x_M450_x_c91_M450\']")).click();
		
	}
	//*[@id="vs_table_IMG_x_M450_x_c91_M450"]
}